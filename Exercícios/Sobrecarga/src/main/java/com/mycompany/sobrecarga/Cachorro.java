/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sobrecarga;

/**
 *
 * @author guiga
 */
public class Cachorro extends Lobo{
    @Override
    public void emitirSom() {
        System.out.println("AU AU AU AU");
    }
    
    public void reagir(String frase) {
        if (frase.equals("Toma Comida") || frase.equals("Oi")) {
            System.out.println("Abanar o rabo e latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanar o rabo");
        } else if (hora >= 18){
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar o rabo e latir");
        }
                
    }
    
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar o rabo");
        } else {
            System.out.println("Rosnar e latir");
        }
    }
    
    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}
