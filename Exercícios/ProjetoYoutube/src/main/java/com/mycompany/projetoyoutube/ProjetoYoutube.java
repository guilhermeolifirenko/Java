package com.mycompany.projetoyoutube;

public class ProjetoYoutube {

    public static void main(String[] args) {
        Video v[] = new Video[2];
        v[0] = new Video("Aula POO");
        v[1] = new Video("Aula JAVA");
        Inscrito i[] = new Inscrito[2];
        
        
        
        Visualizacao vi = new Visualizacao(i[0], v[1]);
        System.out.println(vi.toString());
        System.out.println(v[0].toString());
    }
}
