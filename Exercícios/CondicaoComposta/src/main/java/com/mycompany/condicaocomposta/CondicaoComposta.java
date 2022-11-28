/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.condicaocomposta;

import java.util.Scanner;

/**
 *
 * @author guiga
 */
public class CondicaoComposta {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Em que ano você nasceu? ");
        int nasc = teclado.nextInt();
        int idade = 2022 - nasc;
        System.out.println("Sua idade é "+ idade);
        if (idade>=18) {
            System.out.print("Você é maior de idade!");
        } else {
            System.out.print("Você é um garotinho juvenil!");
        }
    }
}
