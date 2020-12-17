/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java
        
        // Se declara un arreglo de tipo double, llamado promedios
        double[] PM1 = {8.1, 9, 9.5, 10, 9.9};
        double[] PM2 = {7.9, 9.2, 9.7, 9.8, 9.7};
        String[] estudiantes = {"Luis", "Ana", "Mónica", "José", "Juan"};
        double[] promediosFinales = new double[5];
        
        double sumaNotas;
        double promedio;
        
        String mensajeFinal = ""; // variable que acumula un reporte final
        // Se hace uso del ciclo repetitivo for para recorrer los arreglos
        // y presentar los valore de las posiciones
        
        for (int i = 0; i < PM1.length; i++) {
            // se suma el valor de la posición i del arreglo 
            // promediosMateria1 y promediosMateria2
            sumaNotas = PM1[i] + PM2[i];
            // se obtiene el promedio de la suma de las notas
            promedio = sumaNotas / 2;
            // se asigna a la posición i del arreglo promediosFinales
            promediosFinales[i] = promedio;
        }
        
        for (int i = 0; i < PM1.length; i++) { 
            
            mensajeFinal = String.format("%sEstudiante:%s - "+"PM1:%f - "
                    +"PM2: - "
                    + "PROM:"
                    + "%.4f\n", 
                    mensajeFinal,
                    estudiantes[i],
                    PM1[i],
                    PM2[i],
                    promediosFinales[i]);
        }
        
        System.out.printf("%s\n", mensajeFinal);
        
    }

}