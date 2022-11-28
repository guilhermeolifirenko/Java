/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estruturarepeticao;

/**
 *
 * @author guiga
 */
public class EstruturaRepeticao {

    public static void main(String[] args) {
        int mortal = 0;
        while (mortal < 10) {
            mortal++;
            if (mortal == 6) {
                break;
            }
            System.out.println("mortal " + mortal);
        }
    }
}
