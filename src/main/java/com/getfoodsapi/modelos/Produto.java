package com.getfoodsapi.modelos;

import java.math.BigDecimal;

public class Produto {
    private String nome;
    private BigDecimal valor;

    public Produto(String nome, BigDecimal valor) {
	super();
	this.nome = nome;
	this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public BigDecimal getValor() {
	return valor;
    }

    public void setValor(BigDecimal valor) {
	this.valor = valor;
    }

}
