package br.com.autorizador.api.cartao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Guilherme Rocha
 *
 * Criação da entidade cartao
 *
 * @Data, são anotações do Lombok, usadas para gerar métodos Getters e Setters para todos os campos automaticamente.
 * @NoArgsConstructor, é uma anotação do Lombok, usada para gerar um construtor sem argumentos padrão.
 * @AllArgsConstructor, é uma anotação do Lombok, usada para gerar um construtor com todos os argumentos.
 * @Entity é uma anotação JPA, usada para indicar que a classe anotada é uma classe de entidade JPA.
 * @Table, é uma anotação JPA, para especificar mais detalhes sobre a tabela associada à classe.
 * @ManyToMany, anotação responsável ela criação de relacionamentos de N X N de uma tabela. Foi pensado em uma relação
 * de várias transações para vários cartões e posteriormente o seu crecimento de informações a curto prazo de tempo também.
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Accessors(chain = true)
@Table(name = "transacao")
public class Transacao implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany(mappedBy = "cartoes")
    private List<Cartao> cartoes = new ArrayList<>();

    @Column(name = "valor")
    private  Double valor;

}
