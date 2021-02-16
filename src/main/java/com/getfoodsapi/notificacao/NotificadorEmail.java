package com.getfoodsapi.notificacao;

import org.springframework.stereotype.Component;

import com.getfoodsapi.modelos.Cliente;

import java.util.Locale;

public class NotificadorEmail implements Notificador {
private boolean caixaAlta=false;
    public NotificadorEmail() {

        System.out.println("[NotificadorEmail]");
    }

    public void notificar(Cliente cliente, String mensagem) {
        if (caixaAlta){
            mensagem = mensagem.toUpperCase();
        }
	System.out.println("Cliente " + cliente.getNome() + " foi notificado por email:   " + mensagem);
    }
}
