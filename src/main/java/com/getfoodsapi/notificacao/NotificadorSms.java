package com.getfoodsapi.notificacao;


import org.springframework.stereotype.Component;

//@Component
public class NotificadorSms implements Notificador {

    @Override
    public void notificar(com.getfoodsapi.modelos.Cliente cliente, String mensagem) {
	System.out.println("Cliente " + cliente.getNome() + " foi notificado por SMS: " + mensagem);
    }
}
