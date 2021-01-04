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
public class Ejercicio5 {
      public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
            {"Carrie Burton", "Lauren Rice"},{"Emma Escobar", "Lori Flores"},
            {"Steven West", "Toni Martin"}};
        char cadena ;
        String cad = "";
        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int col = 0; col < estudiantes[fila].length; col++) {
                cadena =  estudiantes[fila][col].charAt(0);
                if(String.valueOf(cadena).equals("S")||
                        (String.valueOf(cadena).equals("P")||
                        (String.valueOf(cadena).equals("T")))){
                    cad = String.format("%s%s\n", cad,
                            estudiantes[fila][col]);
                    
                }
            }
        }
        System.out.println("Los estudiantes son:\n" +cad);
    }     
}
