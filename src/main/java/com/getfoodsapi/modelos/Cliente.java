package com.getfoodsapi.modelos;

public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private boolean ativo = false;;

    public Cliente(String nome, String email, String telefone) {
	super();
	this.nome = nome;
	this.email = email;
	this.telefone = telefone;

    }

    @Override
    public String toString() {
        return "\nCliente{\n" +
                "nome='" + nome + '\'' +
                ", \nemail='" + email + '\'' +
                ", \ntelefone='" + telefone + '\'' +
                ", \nativo=" + ativo +
                '}';
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

    public void setAtivo(boolean ativo) {
	this.ativo = ativo;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public boolean isAtivo() {
	return ativo = true;
    }

    public void ativar() {
	this.ativo = true;
    }
}
