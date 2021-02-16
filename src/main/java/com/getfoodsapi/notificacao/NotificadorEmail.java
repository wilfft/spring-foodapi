package com.getfoodsapi.notificacao;

import com.getfoodsapi.modelos.Cliente;

public class NotificadorEmail implements Notificador {

    private boolean caixaAlta;
    private String servidorSmtp;

    public void setCaixaAlta(boolean caixaAlta) {
	this.caixaAlta = caixaAlta;
    }

    public NotificadorEmail(String servidorSmtp) {
	this.servidorSmtp = servidorSmtp;
	System.out.println("[NotificadorEmail]" + servidorSmtp);
    }

    public void notificar(Cliente cliente, String mensagem) {
	if (caixaAlta) {
	    mensagem = mensagem.toUpperCase();
	}
	System.out.println("Cliente " + cliente.getNome() + " foi notificado por email:   " + mensagem
		+ " via servidor:  " + servidorSmtp);
    }

}
