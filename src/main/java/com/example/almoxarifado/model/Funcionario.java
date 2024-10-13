package com.example.almoxarifado.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Funcionario {

    @Id
    private String cpf;
    private String nomeCompleto;
    private String identidade;
    private String email;
    private String telefone;

    @ManyToOne
    @JoinColumn(name = "departamento_nome", referencedColumnName = "nome", nullable = false)
    private Departamento departamento;

    // Construtores
    public Funcionario() {}

    public Funcionario(String cpf, String nomeCompleto, String identidade, String email, String telefone, Departamento departamento) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.identidade = identidade;
        this.email = email;
        this.telefone = telefone;
        this.departamento = departamento;
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

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
