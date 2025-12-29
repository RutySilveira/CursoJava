// Declara o pacote onde essa classe está localizada.
// Normalmente segue a estrutura de pastas do projeto.
package secao12EnumeracoesComposicao.application;

// Importa a classe Date da biblioteca padrão do Java,
// usada para representar data e hora.
import java.util.Date;

// Importa a classe Order, que representa um pedido (entidade do sistema).
import secao12EnumeracoesComposicao.entities.Order;

// Importa o enum OrderStatus, que define os possíveis estados de um pedido.
import secao12EnumeracoesComposicao.entities.enums.OrderStatus;

// Classe principal da aplicação.
// Geralmente contém o método main, ponto de entrada do programa.
public class MainEnum {

  // Método main: é o primeiro método executado quando o programa roda.
  public static void main(String[] args) {

    // Criação de um objeto do tipo Order (pedido).
    // Parâmetros:
    // 1080 -> código/id do pedido
    // new Date() -> data e hora atual do sistema
    // OrderStatus.PENDING_PAYMENT -> status inicial do pedido (enum)
    Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

    // Imprime o objeto order no console.
    // Aqui, o método toString() da classe Order é chamado automaticamente.
    System.out.println(order);

    // Declara uma variável do tipo OrderStatus.
    // Atribui diretamente um valor do enum.
    OrderStatus os1 = OrderStatus.DELIVERED;

    // Declara outra variável do tipo OrderStatus.
    // valueOf converte uma String em um valor do enum.
    // IMPORTANTE:
    // - A String deve ser exatamente igual ao nome do enum (maiúsculas).
    // - Caso contrário, gera uma IllegalArgumentException.
    OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

    // Imprime o valor do enum os1.
    System.out.println(os1);

    // Imprime o valor do enum os2.
    // Mesmo tendo vindo de uma String, ele vira um enum de verdade.
    System.out.println(os2);
  }

}
