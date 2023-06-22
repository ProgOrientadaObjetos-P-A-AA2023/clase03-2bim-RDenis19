/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte{
    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String c, ArrayList<Policia> lista) {
        super(c);
        this.lista = lista;
    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }

    public void establecerPromedioEdades(double promedioEdades) {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getEdad();
        }
        promedioEdades = suma / lista.size();

    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }

    public void establecerLista(ArrayList<Policia> lista) {
        this.lista = lista;
    }
     @Override
    public String toString() {
        String cadena = "Reporte Policia\n";
        cadena = String.format("%sCodigo:%s\n", cadena, codigo);
        cadena = String.format("%sLista de Policias\n", cadena);

        for (int i = 0; i < obtenerLista().size(); i++) {
            Policia d = obtenerLista().get(i);
            cadena = String.format("%sNombre: %s - Edades: %.1f\n", cadena,
                    d.getNombre(), d.getEdad());

        }
        cadena = String.format("%s\nEl promedio de Edades es: "
                + "%.f", cadena, obtenerPromedioEdades());
        return cadena;
    }
}

