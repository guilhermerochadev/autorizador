package br.com.autorizador.api.cartao.repository;

import br.com.autorizador.api.cartao.entity.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Long> {

}
