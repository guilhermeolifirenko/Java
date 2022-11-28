package com.mycompany.matricula;

public class Matricula {

    public static void main(String[] args) {
        /*
        Visitante v1 = new Visitante();
        v1.setNome("Jubiscleisson");
        v1.setSexo("M");
        System.out.println(v1.toString());
        */
        Aluno a1 = new Aluno();
        a1.setNome("Pedrão");
        a1.setMatricula (1111);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Jurandir");
        b1.setMatricula(22222);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
}
