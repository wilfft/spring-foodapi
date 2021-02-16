package com.getfoodsapi.notificacao;

import com.getfoodsapi.modelos.Cliente;
import org.springframework.stereotype.Component;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
