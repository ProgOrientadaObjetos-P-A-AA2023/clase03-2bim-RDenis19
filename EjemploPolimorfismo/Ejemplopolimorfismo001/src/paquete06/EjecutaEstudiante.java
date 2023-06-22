
package paquete06;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de estudiantes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
        */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        int contador;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        
        // inicio de solución
        System.out.println("Ingrese cuantos estudiantes va añadir");
        contador = entrada.nextInt();

        entrada.nextLine();
        for (int i = 0; i < contador; i++) {
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();

            System.out.println("Ingrese el tipo de estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial\n"
                    + "Ingrese (2) para Estudiante Distancia");
            tipoEstudiante = entrada.nextInt();

            entrada.nextLine();
            if (tipoEstudiante == 1) {

                // Declarar,crear e iniciar objeto tipo EstudiantePresencial
                EstudiantePresencial estudianteP = new EstudiantePresencial
                            (nombresEst, apellidosEst);
                // Solicitar ingreso de valores para variables 
                // Solicitar numeroCreds, costoCred
                // Leer numeroCreds, costoCred
                System.out.println("Ingrese el número de créditos");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = entrada.nextDouble();
                System.out.println("");
                // se hace uso de los métodos establecer para asignar valores
                // a los datos (atributos) del objeto
                
                estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                estudianteP.establecerEdadEstudiante(edadEst);
                estudianteP.establecerNumeroCreditos(numeroCreds);
                estudianteP.establecerCostoCredito(costoCred);
                // Se agrega al arreglo estudiantes un objeto de tipo
                // EstudiantePresencial

                estudiantes.add(estudianteP);
                entrada.nextLine();

            } else {
                // Si el usuario ingresa un número diferente del valor 1 para 
                // tipoEstudiante se procede a crear los procesos necesarios para 
                // crear un objeto de tipo EstudianteDistancia

                // Declarar,crear e iniciar objeto tipo EstudianteDistancia
                EstudianteDistancia estudianteD = new EstudianteDistancia
                    (nombresEst, apellidosEst);
                // Solicitar ingreso de valores para variables 
                // Solicitar numeroAsigs, costoAsig 
                // Leer numeroAsigs, costoAsig
                System.out.println("Ingrese el número de asignaturas");
                numeroAsigs = entrada.nextInt();
                System.out.println("Ingrese el costo de cada cada asignatura");
                costoAsig = entrada.nextDouble();
                System.out.println("");

                // se hace uso de los métodos establecer para asignar valores
                // a los datos (atributos) del objeto
                estudianteD.establecerNombresEstudiante(nombresEst);
                estudianteD.establecerApellidoEstudiante(apellidosEst);
                estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                estudianteD.establecerEdadEstudiante(edadEst);
                estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                estudianteD.establecerCostoAsignatura(costoAsig);

                // Se agrega al arreglo estudiantes un objeto de tipo
                // EstudianteDistancia
                estudiantes.add(estudianteD);
                entrada.nextLine();

            }
        }
        
        
        
        
        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();
            
            System.out.printf("Datos Estudiante\n"
                        + "%s\n",                        
                  estudiantes.get(i));
            
        }
    }

}