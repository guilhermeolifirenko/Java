/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.condicaocompostaencadeada;

import java.util.Scanner;

/**
 *
 * @author guiga
 */
public class CondicaoCompostaEncadeada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Em que ano você nasceu? ");
        int nasc = teclado.nextInt();
        int idade = 2022 - nasc;
        System.out.println("Sua idade é "+ idade);
        if (idade<16) {
            System.out.println("Você ainda não pode votar.");
        } else {
            if ((idade >= 16 && idade < 18) || (idade > 70)) {
                System.out.println("Seu voto é opcional.");
            } else {
                System.out.println("Seu voto é obrigatório.");
            }
        }
    }
}
