package com.mycompany.matricula;

public class Bolsista extends Aluno {
    private float bolsa;
    public void renovarBolsa() {
        System.out.println("Bolsa renovada por " + this.nome);
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista. Pagamento com desconto.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
