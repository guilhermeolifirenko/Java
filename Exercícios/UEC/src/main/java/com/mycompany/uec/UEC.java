package com.mycompany.uec;

public class UEC {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador ("Jhon Jones", "Brasil", 28, 12, 0, 1, 1.80f, 68.9f);
        
        l[1] = new Lutador ("Robertinho", "Brasil", 29, 10, 3, 0, 1.75f, 67.8f);
        
        l[2] = new Lutador ("Renatão", "França", 30, 9, 2, 3, 1.80f, 79.5f);
        
        l[3] = new Lutador ("Regina", "Eslovênia", 35, 9, 2, 3, 1.80f, 80.3f);
        
        l[4] = new Lutador ("Tamiranda", "Brasil", 29, 12, 4, 1, 1.80f, 98.5f);
        
        l[5] = new Lutador ("Peter", "Rússia", 32, 12, 2, 3, 1.70f, 100.5f);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[2], l[3]);
        UEC01.lutar();
        
        l[2].status();
        System.out.println("");
        l[3].status();
        
    }
}
