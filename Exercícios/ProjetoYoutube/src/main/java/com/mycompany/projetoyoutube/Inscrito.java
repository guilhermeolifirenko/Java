package com.mycompany.projetoyoutube;

public class Inscrito extends Pessoa {
    private String login;
    private int totAssistido;

    public Inscrito(String login, int totAssistido, String nome, String sexo, int idade, float experiencia) {
        super(nome, sexo, idade, experiencia);
        this.login = login;
        this.totAssistido = 0;
    }
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
}
