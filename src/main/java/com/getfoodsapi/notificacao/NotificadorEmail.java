package com.getfoodsapi.notificacao;

import com.getfoodsapi.modelos.Cliente;
import org.springframework.stereotype.Component;

//@Component
public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
	System.out.println(cliente.getNome() + " foi notificado com a mensagem: " + mensagem);
    }
}