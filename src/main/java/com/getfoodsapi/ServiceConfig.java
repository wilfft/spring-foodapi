package com.getfoodsapi;

import com.getfoodsapi.notificacao.Notificador;
import com.getfoodsapi.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {


    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notificador notificador){
         return new AtivacaoClienteService(notificador);
    }
}
