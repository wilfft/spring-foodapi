package com.getfoodsapi.notificacao;

import com.getfoodsapi.modelos.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Qualifier("normal")
@Component
public class NotificadorEmail implements Notificador {


    @Override
    public void notificar(Cliente cliente, String mensagem) {
	System.out.println(cliente.getNome() + "  notificado por email: " + cliente.getEmail());

	System.out.println(mensagem);
    }
}