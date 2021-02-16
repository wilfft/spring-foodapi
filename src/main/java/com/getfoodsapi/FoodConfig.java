package com.getfoodsapi;

import com.getfoodsapi.notificacao.NotificadorEmail;
import com.getfoodsapi.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoodConfig {


    @Bean
    public NotificadorEmail notificadorEmail() {
        NotificadorEmail notificador = new NotificadorEmail("proxy.123.ai");
       notificador.setCaixaAlta(true);

        return notificador;
    }


    @Bean
    public AtivacaoClienteService ativacaoClienteService(){
        AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificadorEmail() );

        return ativacaoClienteService;
    }
}
