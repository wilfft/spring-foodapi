package com.getfoodsapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.getfoodsapi.modelos.Cliente;
import com.getfoodsapi.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

    @Qualifier("urgente")
    @Autowired
    private Notificador notificador;

    public void Ativar(Cliente cliente) {
	cliente.ativar();
	if (notificador != null) {
	    notificador.notificar(cliente, cliente.toString().toUpperCase());

	} else {

	    System.out.println("Cliente nao notificado ");
	}
    }
}