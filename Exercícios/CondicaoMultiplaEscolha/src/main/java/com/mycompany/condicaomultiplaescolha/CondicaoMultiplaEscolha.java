/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.condicaomultiplaescolha;

import java.util.Scanner;

/**
 *
 * @author guiga
 */
public class CondicaoMultiplaEscolha {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas pernas? ");
        int pernas = teclado.nextInt();
        String tipo;
        System.out.print("Isso é um(a): ");
        switch (pernas) {
        case 1:
            tipo = "Saci";
            break;
        case 2:
            tipo = "Bípede";
            break;
        case 3:
            tipo = "Tripé";
            break;
        case 4:
            tipo = "Quadrúpede";
            break;
        case 6, 8:
            tipo = "Aranha";
            break;
        default:
            tipo = "ET";
    }
        System.out.println(tipo);
    }
}
