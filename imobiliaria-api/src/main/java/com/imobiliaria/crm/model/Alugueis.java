package com.imobiliaria.crm.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Alugueis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Locacao locacao;

    private Date dtVencimento;

    private BigDecimal valorPago;

    private String obs;


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Locacao getLocacao() {
        return this.locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public Date getDtVencimento() {
        return this.dtVencimento;
    }

    public void setDtVencimento(Date dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public BigDecimal getValorPago() {
        return this.valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public String getObs() {
        return this.obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
