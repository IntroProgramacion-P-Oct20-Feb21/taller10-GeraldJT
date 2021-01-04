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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] datos = new double[2][2];
        double x = 0;
        String cadena = "";
        for (double[] dato : datos) {
            for (int col = 0; col < dato.length; col++) {
                System.out.println("Ingrese lo valores");
                dato[col] = entrada.nextDouble();
                x = dato[col];
                cadena = String.format("%s%.2f\n", cadena, x);
            }
        }
        System.out.println(cadena);
    }
}
