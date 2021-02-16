package com.getfoodsapi.notificacao;

import com.getfoodsapi.NivelDeUrgencia;
import com.getfoodsapi.TipoDeNotificador;
import org.springframework.stereotype.Component;


@TipoDeNotificador(NivelDeUrgencia.URGENTE)
@Component
public class NotificadorSms implements Notificador {


    @Override
    public void notificar(com.getfoodsapi.modelos.Cliente cliente, String mensagem) {
	System.out.println("Cliente " + cliente.getNome() + " foi notificado por SMS: " + cliente.getTelefone());

	System.out.println(mensagem);
    }
}
