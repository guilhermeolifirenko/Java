/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooinicial;

/**
 *
 * @author guiga
 */
public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public Caneta(String m, String cl, float p, int c) { //Método construtor
        this.setModelo (m);
        this.setCor (cl);
        this.setPonta (p);
        this.setCarga (c);
        this.tampar();
    }
    
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public String getCor() {
        return this.cor;
    }
    public void setCor(String c) {
        this.cor = c;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public int getCarga() {
    return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void status() {
        System.out.println("O modelo é " + this.getModelo());
        System.out.println("Uma caneta " + this.getCor());
        System.out.println("A ponta é " + this.getPonta());
        System.out.println("A carga é " + this.getCarga());
        System.out.println("Está tampada? " + this.tampada);
    }
    
    public void escrever() {
        if (this.tampada == true) {
            System.out.println("Não posso escrever com a caneta tampada!");
        } else {
            System.out.println("Escrevendo...");
        }
    }
    
    private void tampar() {
        this.tampada = true;
    }
    
    private void destampar() {
        this.tampada = false;
    }
    
}
