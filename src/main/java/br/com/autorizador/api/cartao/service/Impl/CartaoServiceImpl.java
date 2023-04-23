package br.com.autorizador.api.cartao.service.Impl;

import br.com.autorizador.api.cartao.entity.Cartao;
import br.com.autorizador.api.cartao.entity.Transacao;
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
        return null;
    }

    @Override
    public Cartao findByCartaoId(Long id) {
        return null;
    }

    @Override
    public Cartao findByNumeroCartao(Long numeroCartao) {
        return null;
    }

    @Override
    public Cartao insertCartao(Cartao obj) {
        return null;
    }

    @Override
    public Cartao insertTransacao(Transacao obj) {
        return null;
    }

    @Override
    public Cartao updateCartao(Cartao obj) {
        return null;
    }

    @Override
    public void deleteCartao(Long id) {

    }
}
