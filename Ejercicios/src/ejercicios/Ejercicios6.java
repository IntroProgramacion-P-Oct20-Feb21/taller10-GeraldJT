/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author USUARIO PC
 */
public class Ejercicios6 {
      public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
            {"Carrie Burton", "Lauren Rice"},{"Emma Escobar", "Lori Flores"},
            {"Steven West", "Toni Martin"}};
        int cadena ;
        String x = "";
        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int col = 0; col < estudiantes[fila].length; col++) {
                cadena =  estudiantes[fila][col].length();
                if(cadena == 11){
                    x = String.format("%s%s\n", x,
                            estudiantes[fila][col]);
                    
                }
            }
        }
        System.out.println("Los estudiantes son:\n" + x);
    }    
}
      
