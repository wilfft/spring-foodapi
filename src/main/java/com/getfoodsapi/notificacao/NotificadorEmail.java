package com.getfoodsapi.notificacao;

import com.getfoodsapi.NivelDeUrgencia;
import com.getfoodsapi.TipoDeNotificador;
import com.getfoodsapi.modelos.Cliente;
import org.springframework.stereotype.Component;


@TipoDeNotificador(NivelDeUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {


    @Override
    public void notificar(Cliente cliente, String mensagem) {
	System.out.println(cliente.getNome() + "  notificado por email: " + cliente.getEmail());

	System.out.println(mensagem);
    }
}