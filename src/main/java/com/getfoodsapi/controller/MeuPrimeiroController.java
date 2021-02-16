package com.getfoodsapi.controller;

import com.getfoodsapi.modelos.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.getfoodsapi.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
    private AtivacaoClienteService ativacaoClientService;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClientService) {
       this.ativacaoClientService = ativacaoClientService;
    }
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Cliente joao = new Cliente("joao", "wil_Ff@hotmail.com", "92039023");

        ativacaoClientService.Ativar(joao);

        return joao.toString();
    }
}
