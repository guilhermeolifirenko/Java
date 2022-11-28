/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pooinicial;

/**
 *
 * @author guiga
 */
public class PooInicial {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Preto", 0.5f, 80);
        c1.status();
        c1.escrever();
        
        System.out.println(" ");
        
        Caneta c2 = new Caneta("BIC", "Azul", 0.6f, 100);
        c2.status();
        }
    }
