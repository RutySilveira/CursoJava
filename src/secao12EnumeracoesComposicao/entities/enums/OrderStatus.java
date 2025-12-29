// Declara o pacote onde este enum está localizado.
// Geralmente enums ficam em um subpacote "enums" por organização.
package secao12EnumeracoesComposicao.entities.enums;

// Declaração de um ENUM (tipo enumerado) chamado OrderStatus.
// Um enum representa um conjunto FIXO e CONTROLADO de valores.
// É muito usado para estados, categorias e situações bem definidas.
public enum OrderStatus { // Tipo enumerado

  // Representa que o pedido foi criado,
  // mas o pagamento ainda não foi confirmado.
  PENDING_PAYMENT,

  // Representa que o pagamento já foi aprovado
  // e o pedido está em processamento.
  PROCESSING,

  // Representa que o pedido já foi enviado
  // (saiu para entrega / está a caminho).
  SHIPPED,

  // Representa que o pedido foi entregue ao cliente
  // e o processo foi finalizado.
  DELIVERED;
}
