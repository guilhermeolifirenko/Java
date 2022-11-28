/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.metodos;

/**
 *
 * @author guiga
 */
public class Metodos {

    static int soma(int a, int b) {
      int s = a + b;  
      return s;
    };
    
    public static void main(String[] args) {
        int sm = soma(18, 21);
        System.out.println("A soma vale " + sm);
    }
}
