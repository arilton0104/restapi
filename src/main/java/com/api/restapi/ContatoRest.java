package com.api.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.restapi.database.RepositorioContato;
import com.api.restapi.entidade.Contato;

@RestController
@RequestMapping("/contato")
public class ContatoRest {
    @Autowired
    private RepositorioContato repositorio;

    @GetMapping
    public List<Contato> listar() {
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Contato contato) {
        repositorio.save(contato);
    }

    @PutMapping
    public void alterar(@RequestBody Contato contato) {
        if (contato.getId() > 0)
            repositorio.save(contato);
    }

    @DeleteMapping
    public void excluir(@RequestBody Contato contato) {
        repositorio.delete(contato);
    }

}

/*
 * @Autowired
 * 
 * A anotação @Autowired é utilizada no Java para indicar que um atributo de uma
 * classe deve ser injetado automaticamente pelo Spring Framework. Isso
 * significa que o Spring irá criar uma instância do tipo do atributo e
 * injetá-la no objeto da classe.
 * 
 * Para que um atributo seja injetado automaticamente, ele deve ser marcado com
 * a anotação @Autowired. Além disso, o atributo deve ter um tipo que seja uma
 * interface ou uma classe que esteja registrada no Spring.
 * 
 * A anotação @Autowired pode ser utilizada com qualquer tipo de atributo,
 * incluindo atributos primitivos, objetos, arrays e coleções.
 * 
 * A seguir, um exemplo de como utilizar a anotação @Autowired:
 * 
 * Java
 * 
 * @Service
 * public class MinhaClasse {
 * 
 * @Autowired
 * private IMetodoOutro metodoOutro;
 * 
 * public void metodo() {
 * metodoOutro.metodo();
 * }
 * }
 * Use o código com cuidado. Saiba mais
 * Nesse exemplo, a classe MinhaClasse tem um atributo metodoOutro do tipo
 * IMetodoOutro. O atributo é marcado com a anotação @Autowired, o que indica
 * que o Spring irá criar uma instância da classe IMetodoOutro e injetá-la no
 * objeto da classe MinhaClasse.
 * 
 * Ao usar a anotação @Autowired, o desenvolvedor não precisa se preocupar com a
 * criação de instâncias de objetos ou com a injeção de dependências. O Spring
 * irá gerenciar isso automaticamente.
 * 
 * A anotação @Autowired é uma das principais anotações do Spring Framework, e é
 * essencial para o desenvolvimento de aplicações Java que utilizam o Spring.
 * 
 * Alguns exemplos de como a anotação @Autowired pode ser utilizada:
 * 
 * Para injetar dependências de serviços.
 * Para injetar dependências de repositórios.
 * Para injetar dependências de frameworks externos.
 * A anotação @Autowired pode ser utilizada com qualquer tipo de atributo, desde
 * que o tipo do atributo seja uma interface ou uma classe que esteja registrada
 * no Spring.
 */

/*
 * A anotação @RestController
 * é utilizada no Java para indicar que uma classe é um controlador REST. Isso
 * significa que a classe é responsável por lidar com solicitações HTTP e
 * retornar respostas HTTP.
 * 
 * Para que uma classe seja considerada um controlador REST, ela deve estar
 * marcada com a anotação @RestController. Além disso, a classe deve ter métodos
 * anotados com anotações HTTP, como @GetMapping, @PostMapping, @PutMapping
 * e @DeleteMapping.
 * 
 * A anotação @RestController é uma combinação das anotações @Controller
 * e @ResponseBody. A anotação @Controller indica que a classe é um controlador,
 * enquanto a anotação @ResponseBody indica que o valor de retorno do método
 * deve ser serializado para o corpo da resposta HTTP.
 * 
 * A seguir, um exemplo de como utilizar a anotação @RestController:
 * 
 * Java
 * 
 * @RestController
 * public class ProdutoController {
 * 
 * @GetMapping("/produtos")
 * public List<Produto> listarProdutos() {
 * // ...
 * return produtos;
 * }
 * 
 * @PostMapping("/produtos")
 * public Produto salvarProduto(Produto produto) {
 * // ...
 * return produto;
 * }
 * }
 * Use o código com cuidado. Saiba mais
 * Nesse exemplo, a classe ProdutoController é um controlador REST que gerencia
 * produtos. O método listarProdutos() retorna uma lista de produtos, enquanto o
 * método salvarProduto() salva um produto.
 * 
 * Ao usar a anotação @RestController, o desenvolvedor não precisa se preocupar
 * com a serialização do valor de retorno dos métodos. O Spring irá serializar o
 * valor de retorno automaticamente, de acordo com o tipo do valor de retorno.
 * 
 * A anotação @RestController é uma das principais anotações do Spring Boot, e é
 * essencial para o desenvolvimento de aplicações Java que utilizam o Spring
 * Boot para criar APIs REST.
 * 
 * 
 */

/*
 * A anotação @RequestMapping
 * é utilizada no Java para mapear solicitações HTTP para métodos em classes de
 * controlador. Isso permite que os desenvolvedores criem APIs REST que são
 * facilmente acessíveis por clientes HTTP.
 * 
 * A anotação @RequestMapping pode ser aplicada a classes, métodos ou parâmetros
 * de métodos. Quando aplicada a uma classe, ela indica que a classe é um
 * controlador HTTP. Quando aplicada a um método, ela indica que o método é
 * responsável por lidar com uma solicitação HTTP específica. Quando aplicada a
 * um parâmetro de método, ela indica que o parâmetro representa um valor de
 * solicitação HTTP.
 * 
 * A anotação @RequestMapping tem vários atributos que permitem aos
 * desenvolvedores especificar como as solicitações HTTP devem ser mapeadas para
 * métodos. Os atributos mais comuns são:
 * 
 * value: o caminho da solicitação HTTP que deve ser mapeada para o método.
 * method: o método HTTP que deve ser utilizado para a solicitação.
 * params: os parâmetros da solicitação HTTP que devem ser verificados para
 * determinar se a solicitação deve ser mapeada para o método.
 * headers: os cabeçalhos da solicitação HTTP que devem ser verificados para
 * determinar se a solicitação deve ser mapeada para o método.
 * consumes: os tipos de conteúdo da solicitação HTTP que devem ser aceitos pelo
 * método.
 * produces: os tipos de conteúdo da resposta HTTP que devem ser produzidos pelo
 * método.
 * A seguir, um exemplo de como utilizar a anotação @RequestMapping:
 * 
 * Java
 * 
 * @RestController
 * public class ProdutoController {
 * 
 * @GetMapping("/produtos")
 * public List<Produto> listarProdutos() {
 * // ...
 * return produtos;
 * }
 * 
 * @PostMapping("/produtos")
 * public Produto salvarProduto(Produto produto) {
 * // ...
 * return produto;
 * }
 * }
 * Use o código com cuidado. Saiba mais
 * Nesse exemplo, a classe ProdutoController é um controlador REST que gerencia
 * produtos. O método listarProdutos() é mapeado para solicitações HTTP GET para
 * o caminho /produtos. O método salvarProduto() é mapeado para solicitações
 * HTTP POST para o caminho /produtos.
 * 
 * Ao usar a anotação @RequestMapping, os desenvolvedores podem criar APIs REST
 * que são facilmente acessíveis por clientes HTTP. A anotação @RequestMapping é
 * uma das principais anotações do Spring Framework, e é essencial para o
 * desenvolvimento de aplicações Java que utilizam o Spring Framework para criar
 * APIs REST.
 * 
 * 
 */

/*
 * A anotação @RequestBody é utilizada no Java para associar um parâmetro de
 * método a um valor de solicitação HTTP. Isso permite que os desenvolvedores
 * criem APIs REST que podem receber dados do cliente HTTP no corpo da
 * solicitação.
 * 
 * A anotação @RequestBody pode ser aplicada a qualquer parâmetro de método.
 * Quando aplicada a um parâmetro, ela indica que o parâmetro representa um
 * valor de solicitação HTTP que deve ser deserializado para um objeto Java.
 * 
 * O tipo do parâmetro de método deve ser um tipo de objeto que possa ser
 * deserializado a partir do corpo da solicitação HTTP. O tipo de conteúdo da
 * solicitação HTTP deve ser compatível com o tipo de objeto.
 * 
 * A seguir, um exemplo de como utilizar a anotação @RequestBody:
 * 
 * Java
 * 
 * @RestController
 * public class ProdutoController {
 * 
 * @PostMapping("/produtos")
 * public Produto salvarProduto(@RequestBody Produto produto) {
 * // ...
 * return produto;
 * }
 * }
 * Use o código com cuidado. Saiba mais
 * Nesse exemplo, a classe ProdutoController é um controlador REST que gerencia
 * produtos. O método salvarProduto() é mapeado para solicitações HTTP POST para
 * o caminho /produtos. O parâmetro produto é anotado com a
 * anotação @RequestBody, o que indica que o parâmetro representa um valor de
 * solicitação HTTP que deve ser deserializado para um objeto Produto.
 * 
 * Ao usar a anotação @RequestBody, os desenvolvedores podem criar APIs REST que
 * podem receber dados do cliente HTTP no corpo da solicitação. A
 * anotação @RequestBody é uma das principais anotações do Spring Framework, e é
 * essencial para o desenvolvimento de aplicações Java que utilizam o Spring
 * Framework para criar APIs REST.
 * 
 * Alguns exemplos de como a anotação @RequestBody pode ser utilizada:
 * 
 * Para receber dados de um formulário HTML.
 * Para receber dados de um arquivo JSON ou XML.
 * Para receber dados de um serviço externo.
 * A anotação @RequestBody pode ser aplicada a qualquer tipo de parâmetro de
 * método, desde que o tipo de conteúdo da solicitação HTTP seja compatível com
 * o tipo de objeto.
 * 
 * 
 */