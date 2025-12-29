// Declara o pacote onde a classe Order está localizada.
// Normalmente fica no pacote entities por representar uma entidade do sistema.
package secao12EnumeracoesComposicao.entities;

// Importa a classe Date para trabalhar com data e hora do pedido.
import java.util.Date;

// Importa o enum OrderStatus, que define os possíveis estados de um pedido.
import secao12EnumeracoesComposicao.entities.enums.OrderStatus;

// Declaração da classe Order.
// Essa classe representa um PEDIDO dentro do sistema.
public class Order {

  // Atributo que representa o identificador do pedido.
  // Integer (classe wrapper) permite trabalhar com null.
  private Integer id;

  // Atributo que armazena a data e hora em que o pedido foi criado.
  private Date moment;

  // Atributo que representa o status do pedido.
  // Usa um enum para garantir valores válidos e controlados.
  private OrderStatus status;

  // Construtor padrão (sem parâmetros).
  // É exigido em alguns frameworks e útil quando o objeto
  // será criado e preenchido depois.
  public Order() {
  }

  // Construtor com parâmetros.
  // Permite criar o objeto já com todos os dados preenchidos.
  public Order(Integer id, Date moment, OrderStatus status) {
    // A palavra-chave "this" diferencia o atributo da classe
    // do parâmetro recebido pelo construtor.
    this.id = id;
    this.moment = moment;
    this.status = status;
  }

  // Método getter do atributo id.
  // Permite acessar o valor do id de forma controlada.
  public Integer getId() {
    return id;
  }

  // Método setter do atributo id.
  // Permite modificar o valor do id.
  public void setId(Integer id) {
    this.id = id;
  }

  // Método getter do atributo moment.
  // Retorna a data e hora do pedido.
  public Date getMoment() {
    return moment;
  }

  // Método setter do atributo moment.
  // Permite alterar a data e hora do pedido.
  public void setMoment(Date moment) {
    this.moment = moment;
  }

  // Método getter do atributo status.
  // Retorna o status atual do pedido.
  public OrderStatus getStatus() {
    return status;
  }

  // Método setter do atributo status.
  // Permite alterar o status do pedido,
  // garantindo que seja um valor válido do enum.
  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  // Sobrescrita do método toString().
  // Define como o objeto Order será representado em forma de texto.
  // Esse método é chamado automaticamente quando usamos System.out.println(obj).
  @Override
  public String toString() {
    return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
  }
}
