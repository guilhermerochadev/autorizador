package br.com.autorizador.api.cartao.service;

import br.com.autorizador.api.cartao.entity.Cartao;
import br.com.autorizador.api.cartao.entity.Transacao;

import java.util.List;

/**
 * @author Guilherme Rocha
 *
 * Interface CartaoService, que vai ser implentada na classe CartaoServiceImpl
 */
public interface CartaoService {


    public List<Cartao>getAllCartao();
    public Cartao findByCartaoId(Long id);
    public Cartao findByNumeroCartao(Long numeroCartao);
    public Cartao insertCartao(Cartao obj);
    public Cartao insertTransacao(Transacao obj);
    public Cartao updateCartao(Cartao obj);
    public void deleteCartao(Long id);


}
