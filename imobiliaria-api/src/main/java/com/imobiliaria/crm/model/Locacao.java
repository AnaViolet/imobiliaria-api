package com.imobiliaria.crm.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class Locacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne
    private Cliente inquilino;

    @OneToMany
    private Alugueis imovel;

    private boolean ativo;
    private Date dataFim;
    private Date dataInicio;
    private int diaVencimento;
    private Float percMulta;

    @NotEmpty
    private BigDecimal valorAluguel;

    private String obs;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getInquilino() {
        return this.inquilino;
    }

    public void setInquilino(Cliente inquilino) {
        this.inquilino = inquilino;
    }

    public Alugueis getImovel() {
        return this.imovel;
    }

    public void setImovel(Alugueis imovel) {
        this.imovel = imovel;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public boolean getAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Date getDataFim() {
        return this.dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Date getDataInicio() {
        return this.dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public int getDiaVencimento() {
        return this.diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public Float getPercMulta() {
        return this.percMulta;
    }

    public void setPercMulta(Float percMulta) {
        this.percMulta = percMulta;
    }

    public BigDecimal getValorAluguel() {
        return this.valorAluguel;
    }

    public void setValorAluguel(BigDecimal valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getObs() {
        return this.obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

}
