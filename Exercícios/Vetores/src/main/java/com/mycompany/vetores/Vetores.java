/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vetores;

import java.util.Arrays;

/**
 *
 * @author guiga
 */
public class Vetores {

    public static void main(String[] args) {
        /*
        int n[] = {3, 6, 9, 12, 15};
        for(int c = 0; c <= 4; c++){
            System.out.println("Na posição " + c + " Temos o valor " + n[c]);
        };
        
        
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", 
                        "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for (int c = 0; c < mes.length; c++){
            System.out.println("O mês de " + mes[c] + " tem " + dias[c] + 
                                " dias ao todo.");
        }
        */
        
        double v[] = {3.5, 2.90, 9, -3.3};
        Arrays.sort(v); //Colocar em ordem crescente
        for (double valor: v) {
            System.out.println(valor + " ");
        }
    }
}
