package com.api.restapi.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private String email;
    private String urlAvatar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrlAvatar() {
        return urlAvatar;
    }

    public void setUrlAvatar(String urlAvatar) {
        this.urlAvatar = urlAvatar;
    }

}

//

/*
 * / @Entity
 * 
 * A anotação @Entity é utilizada no Java para indicar que uma classe representa
 * uma
 * entidade do banco de dados. Isso permite que a JPA, a especificação de
 * persistência
 * de objetos para Java, gere automaticamente as operações de persistência para
 * essa classe,
 * como salvar, atualizar, excluir e buscar objetos.
 * 
 * Para que uma classe seja considerada uma entidade, ela deve estar marcada com
 * a
 * anotação @Entity. Além disso, a classe deve ter um atributo marcado com a
 * anotação @Id,
 * que representa a chave primária da tabela no banco de dados.
 * 
 * A anotação @Entity também pode receber um parâmetro opcional, name, que
 * especifica o
 * nome da tabela no banco de dados que será associada à entidade. Se esse
 * parâmetro não for especificado,
 * o nome da classe será utilizado como o nome da tabela.
 * 
 */

/*
 * @id
 * 
 * 
 * A anotação @Id é utilizada no Java para indicar que um atributo de uma classe
 * representa a chave primária da tabela no banco de dados. Isso permite que a
 * JPA, a especificação de persistência de objetos para Java, gere
 * automaticamente as operações de persistência para esse atributo, como salvar,
 * atualizar, excluir e buscar objetos.
 * 
 * Para que um atributo seja considerado uma chave primária, ele deve estar
 * marcado com a anotação @Id. Além disso, o atributo deve ser único e não nulo.
 * 
 * A anotação @Id também pode receber um parâmetro opcional, name, que
 * especifica o nome da coluna no banco de dados que será associada ao atributo.
 * Se esse parâmetro não for especificado, o nome do atributo será utilizado
 * como o nome da coluna.
 * 
 */

/*
 * @GeneratedValue
 * 
 * A anotação @GeneratedValue é utilizada no Java para indicar que o valor de um
 * atributo é gerado automaticamente pelo banco de dados. Isso é útil para
 * atributos que representam chaves primárias, pois garante que cada objeto
 * tenha um valor exclusivo para a chave primária.
 * 
 * A anotação @GeneratedValue pode ser utilizada com qualquer tipo de atributo,
 * desde que ele seja único e não nulo. Os tipos de atributos mais comuns
 * utilizados para chaves primárias são:
 * 
 * Long
 * Integer
 * String
 * UUID
 * A anotação @GeneratedValue tem um atributo obrigatório, strategy, que
 * especifica a estratégia de geração do valor do atributo. As estratégias de
 * geração de valor suportadas pela JPA são:
 * 
 * IDENTITY: o valor do atributo é gerado automaticamente pelo banco de dados,
 * usando uma coluna de auto incremento.
 * SEQUENCE: o valor do atributo é gerado automaticamente pelo banco de dados,
 * usando uma sequência.
 * TABLE: o valor do atributo é gerado automaticamente pelo banco de dados,
 * usando uma tabela.
 * AUTO: a estratégia de geração do valor é determinada pelo provedor de
 * persistência.
 */

/*
 * Os getters e setters
 * 
 * são métodos em Java com propósitos opostos, mas que trabalham juntos para
 * controlar o acesso e a manipulação de dados dentro de uma classe.
 * 
 * Getters são métodos que recuperam o valor de um atributo privado da classe.
 * Eles geralmente seguem a convenção de começar com "get" seguido do nome do
 * atributo, inicializado em maiúscula. Por exemplo, para um atributo chamado
 * "nome", o getter seria "getNome".
 * 
 * Setters são métodos que alteram o valor de um atributo privado da classe.
 * Eles geralmente seguem a convenção de começar com "set" seguido do nome do
 * atributo, inicializado em maiúscula, seguido de um parâmetro com o mesmo tipo
 * do atributo. Por exemplo, para um atributo chamado "nome", o setter seria
 * "setNome(String nome)".
 * 
 * Por que usar getters e setters?
 * 
 * Encapsulamento: Utilizando atributos privados e acessando-os somente através
 * de getters e setters, você esconde a implementação interna da classe e
 * aumenta o controle sobre seus dados.
 * Validação: Os setters podem ser usados para validar os valores inseridos
 * antes de atribuí-los aos atributos, garantindo a integridade dos dados.
 * Segurança: Atributos privados protegem os dados de acesso e modificação
 * indevida de fora da classe.
 * Flexibilidade: Getters e setters permitem personalizar o acesso e a
 * manipulação de dados baseados em diferentes contextos e regras de negócio.
 * 
 * 
 */