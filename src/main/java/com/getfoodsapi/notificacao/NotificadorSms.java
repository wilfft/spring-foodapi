package com.getfoodsapi.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Qualifier("urgente")
@Component
public class NotificadorSms implements Notificador {


    @Override
    public void notificar(com.getfoodsapi.modelos.Cliente cliente, String mensagem) {
	System.out.println("Cliente " + cliente.getNome() + " foi notificado por SMS: " + cliente.getTelefone());

	System.out.println(mensagem);
    }
}
