package com.mycompany.polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        
        mamifero.setPeso(40.3f);
        mamifero.setCorPelo("marrom");
        mamifero.alimentar();
        mamifero.locomover();
        mamifero.emitirSom();
        
        reptil.locomover();
        peixe.locomover();
        ave.locomover();
        canguru.locomover();
        cachorro.locomover();
    }
}
