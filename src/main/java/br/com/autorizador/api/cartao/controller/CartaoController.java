package br.com.autorizador.api.cartao.controller;

import br.com.autorizador.api.cartao.entity.Cartao;
import br.com.autorizador.api.cartao.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Guilherme Rocha
 * Criação da classe CartaoController
 * Por padronização e boas práticas o mapeamento do RequestMapping foi versionado.
 */
@RestController
@RequestMapping("api/v1/")
public class CartaoController {

    @Autowired
    private  CartaoService CartaoService;

    @GetMapping("")
    public List<Cartao>cartaoList(){
        return CartaoService.getAllCartao();
    }




}
