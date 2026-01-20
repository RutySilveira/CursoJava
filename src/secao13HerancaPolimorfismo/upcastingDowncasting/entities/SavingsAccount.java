package secao13HerancaPolimorfismo.upcastingDowncasting.entities;

// Classe SavingsAccount (Conta Poupança)
// Subclasse de Account, usada em exemplos de herança e casting
public class SavingsAccount extends Account {

  // Taxa de juros da conta poupança
  private Double interestRate;

  // Construtor padrão
  // Chama o construtor padrão da superclasse Account
  public SavingsAccount() {
    super();
  }

  // Construtor com parâmetros
  // Inicializa os atributos herdados da classe Account
  // e o atributo específico da SavingsAccount
  public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
    super(number, holder, balance); // inicializa number, holder e balance
    this.interestRate = interestRate; // inicializa a taxa de juros
  }

  // Retorna a taxa de juros da conta
  public Double getInterestRate() {
    return interestRate;
  }

  // Define/atualiza a taxa de juros da conta
  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }

  // Atualiza o saldo aplicando os juros
  // Método específico da SavingsAccount
  // Só pode ser acessado diretamente quando a referência
  // é do tipo SavingsAccount (downcasting)
  public void updateBalance() {
    // Acesso direto ao balance permitido
    // porque ele é protected na classe Account
    balance += balance * interestRate;
  }
}
