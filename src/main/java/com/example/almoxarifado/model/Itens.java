package com.example.almoxarifado.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Itens")
public class Itens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_item")
    private Integer idItem;

    @Column(name = "nome_item", nullable = false)
    private String nomeItem;

    @Column(name = "descricao", columnDefinition = "TEXT")
    private String descricao;

    @Column(name = "data_recebimento", nullable = false)
    private LocalDate dataRecebimento;

    @Column(name = "unidade", length = 50)
    private String unidade;

    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;

    @Column(name = "preco", precision = 10, scale = 2)
    private BigDecimal preco;

    @Column(name = "localizacao")
    private String localizacao;

    @Column(name = "codigo_catmat", length = 50)
    private String codigoCatmat;

    // Construtores
    public Itens() {
    }

    public Itens(String nomeItem, String descricao, LocalDate dataRecebimento, String unidade, Integer quantidade, BigDecimal preco, String localizacao, String codigoCatmat) {
        this.nomeItem = nomeItem;
        this.descricao = descricao;
        this.dataRecebimento = dataRecebimento;
        this.unidade = unidade;
        this.quantidade = quantidade;
        this.preco = preco;
        this.localizacao = localizacao;
        this.codigoCatmat = codigoCatmat;
    }

    // Getters e Setters
    public Integer getIdItem() {
        return idItem;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(LocalDate dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getCodigoCatmat() {
        return codigoCatmat;
    }

    public void setCodigoCatmat(String codigoCatmat) {
        this.codigoCatmat = codigoCatmat;
    }
}
