/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.condicaosimples;

import java.util.Scanner;

/**
 *
 * @author guiga
 */
public class CondicaoSimples {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = teclado.nextFloat();
        float avg = (n1+n2)/2;
        System.out.println("A média foi "+ avg);
        if (avg>=9) {
            System.out.println("Parabéns, você é nerd!");
        }
    }
}
