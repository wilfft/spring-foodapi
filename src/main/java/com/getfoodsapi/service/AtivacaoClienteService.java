package com.getfoodsapi.service;

import com.getfoodsapi.modelos.Cliente;
import com.getfoodsapi.notificacao.Notificador;
import com.getfoodsapi.notificacao.NotificadorEmail;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {
    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void Ativar(Cliente cliente) {
        cliente.ativar();
       notificador.notificar(cliente, cliente.getEmail() + "  foi notificado via ativaçao cliente.  " + cliente.toString());


    }
}