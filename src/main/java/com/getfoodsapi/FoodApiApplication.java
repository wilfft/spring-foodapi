package com.getfoodsapi;

import com.getfoodsapi.notificacao.NotificadorEmail;
import com.getfoodsapi.service.AtivacaoClienteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.getfoodsapi.modelos.Cliente;

@SpringBootApplication
public class FoodApiApplication {

    public static void main(String[] args) {
	SpringApplication.run(FoodApiApplication.class, args);

	Cliente wil = new Cliente("WIlliam", "wil_ff@gotm.com", "999499499");
NotificadorEmail notificador = new NotificadorEmail();
	AtivacaoClienteService ativaCliente = new AtivacaoClienteService(notificador);
	ativaCliente.Ativar(wil);

    }
}