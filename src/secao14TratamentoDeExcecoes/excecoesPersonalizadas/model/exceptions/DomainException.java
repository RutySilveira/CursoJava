package secao14TratamentoDeExcecoes.excecoesPersonalizadas.model.exceptions;

// Classe de exceção personalizada para representar erros de regra de negócio (domínio)
public class DomainException extends RuntimeException {

  // serialVersionUID é usado no processo de serialização
  // Garante compatibilidade entre diferentes versões da classe
  private static final long serialVersionUID = 1L;

  // Construtor da exceção personalizada
  // Recebe uma mensagem que descreve o erro ocorrido
  public DomainException(String msg) {

    // Chama o construtor da classe pai (RuntimeException)
    // Isso permite que a mensagem seja recuperada com getMessage()
    super(msg);
  }

}
