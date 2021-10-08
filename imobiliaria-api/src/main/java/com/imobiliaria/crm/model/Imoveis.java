package com.imobiliaria.crm.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Imoveis {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tipoImovel;

    private String endereco;

    @Size(min = 8, message = "CEP deve ter no mínimo {min} dígitos.")
    private String cep;

    private int dormitorios;
    private int banheiros;
    private int suites;
    private int metragem;

    private BigDecimal valorAluguelSug;

    private String obs;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoImovel() {
        return this.tipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getDormitorios() {
        return this.dormitorios;
    }

    public void setDormitorios(int dormitorios) {
        this.dormitorios = dormitorios;
    }

    public int getBanheiros() {
        return this.banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public int getSuites() {
        return this.suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getMetragem() {
        return this.metragem;
    }

    public void setMetragem(int metragem) {
        this.metragem = metragem;
    }

    public BigDecimal getValorAluguelSug() {
        return this.valorAluguelSug;
    }

    public void setValorAluguelSug(BigDecimal valorAluguelSug) {
        this.valorAluguelSug = valorAluguelSug;
    }

    public String getObs() {
        return this.obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }    
}
