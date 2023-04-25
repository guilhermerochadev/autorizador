package br.com.autorizador.api.cartao.service.Impl;

import br.com.autorizador.api.cartao.entity.Cartao;
import br.com.autorizador.api.cartao.repository.CartaoRepository;
import br.com.autorizador.api.cartao.service.CartaoService;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@Slf4j
public class CartaoServiceImpl implements CartaoService {

    @Autowired
    private CartaoRepository cartaoRepository;

    @Override
    public List<Cartao> getAllCartao() {
        return cartaoRepository.findAll();
    }

    @Override
    public Cartao findByCartaoId(Long id) {
        return cartaoRepository.findById(id).get();
    }

    @Override
    public Cartao findByNumeroCartao(Long numeroCartao) {
        return cartaoRepository.findById(numeroCartao).get();
    }

    @Override
    public Cartao insertCartao(Cartao obj) {
        return cartaoRepository.save(obj);
    }

    @Override
    public void deleteCartao(Long id) {
        cartaoRepository.deleteById(id);
    }
}
