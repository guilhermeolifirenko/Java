package com.mycompany.controle;

public class Passagem {
    // Atributos
    private int dia, mes, ano, poltrona, totPassagem;
    private float hora, valor, desconto;

   // Métodos Abstratos
   public void criarPassagem() {
       System.out.println("Passagem emitida com sucesso!");
   }
   
   public void validarPassagem() {
       if ((this.getDia() <= 31 && this.getDia() >= 1) && (this.getMes() <= 12 && this.getMes() >= 1) && this.getAno() >= 2022) {
           System.out.println("Agendado para " + this.getDia() + "/" + this.getMes() + "/" + this.getAno() + " às " + this.getHora());
       } else {
           System.out.println("Impossível agendar para esta data, verifique os dados e tente novamente.");
       }
   }

    public Passagem(int dia, int mes, int ano, float hora) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
    }
   
   // Métodos Especiais
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPoltrona() {
        return poltrona;
    }
    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public int getTotPassagem() {
        return totPassagem;
    }
    public void setTotPassagem(int totPassagem) {
        this.totPassagem = totPassagem;
    }

    public float getHora() {
        return hora;
    }
    public void setHora(float hora) {
        this.hora = hora;
    }

    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getDesconto() {
        return desconto;
    }
    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
   
}
