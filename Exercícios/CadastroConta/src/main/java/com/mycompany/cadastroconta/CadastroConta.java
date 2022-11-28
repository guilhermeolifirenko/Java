package com.mycompany.cadastroconta;

public class CadastroConta {

    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(1001);
        c1.setDono("Wanderley");
        c1.abrirConta("CC");
        c1.getSaldo();
        c1.estadoAtual();
        
        System.out.println(" ");
        
        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(2002);
        c2.setDono("Camile");
        c2.abrirConta("CP");
        c2.sacar(100);
        c2.depositar(500);
        c2.getSaldo();
        c2.estadoAtual();
    }
}
