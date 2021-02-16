package com.getfoodsapi.service;

import com.getfoodsapi.notificacao.Notificador;
import com.getfoodsapi.modelos.Cliente;
import com.getfoodsapi.modelos.Produto;
import com.getfoodsapi.notificacao.NotificadorSms;

public class EmissãoNotaFiscalService {

    private Notificador notificador;
    public EmissãoNotaFiscalService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void emitirNF(Cliente cliente, Produto produto) {
        NotificadorSms notificador = new NotificadorSms();

	notificador.notificar(cliente, cliente.getNome() + " NOTA DE COMPRA: " + produto.toString());

    }
}