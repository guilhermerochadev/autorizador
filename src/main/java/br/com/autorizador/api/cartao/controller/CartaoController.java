package br.com.autorizador.api.cartao.controller;

import br.com.autorizador.api.cartao.dto.CartaoDTO;
import br.com.autorizador.api.cartao.entity.Cartao;
import br.com.autorizador.api.cartao.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
    public ResponseEntity<List<Cartao>>findAllCartao(){
        List<Cartao> listCartao = CartaoService.getAllCartao();
        return  ResponseEntity.ok().body(listCartao);
    }


    @PostMapping("/cartoes")
    public ResponseEntity<Cartao>createCartao(@RequestBody Cartao objCartao){

        objCartao = CartaoService.insertCartao(objCartao);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(objCartao.getId()).toUri();
        return ResponseEntity.created(uri).body(objCartao);

    }

   @GetMapping("cartoes/{numeroCartao}")
   public ResponseEntity<Cartao> findNumeroCartao(@PathVariable Long numeroCartao){
        Cartao objCartao = CartaoService.findByNumeroCartao(numeroCartao);
        return ResponseEntity.ok().body(objCartao);
   }





























}
