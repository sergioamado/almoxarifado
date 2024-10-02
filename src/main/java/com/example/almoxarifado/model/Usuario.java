package com.example.almoxarifado.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
    @Id
    private String cpf;

    private String nomeCompleto;
    private String email;

    
    public Usuario() {}

    public Usuario(String cpf, String nomeCompleto, String email) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
