package com.example.almoxarifado.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Funcionario {
    @Id
    private String cpf;

    private String nomeCompleto;
    private String identidade;
    private String email;
    private String telefone;
    private String departamentoNome;

    // Construtores, getters e setters
}
