package secao13HerancaPolimorfismo.classesAbstratas.entities;

// SavingsAccount representa uma conta poupança
// É uma classe CONCRETA que herda da classe abstrata Account
// Possui comportamentos específicos, como aplicação de juros
public class SavingsAccount extends Account {

  // Taxa de juros da conta poupança
  // Exemplo: 0.02 = 2% de juros
  private Double interestRate;

  // Construtor padrão
  // Chama o construtor padrão da classe mãe (Account)
  public SavingsAccount() {
    super();
  }

  // Construtor com parâmetros
  // Inicializa os atributos herdados da Account
  // e o atributo específico da SavingsAccount (interestRate)
  public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
    super(number, holder, balance); // inicializa number, holder e balance
    this.interestRate = interestRate;
  }

  // Getter da taxa de juros
  public Double getInterestRate() {
    return interestRate;
  }

  // Setter da taxa de juros
  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }

  // Método específico da SavingsAccount
  // Atualiza o saldo aplicando os juros
  // Fórmula:
  // novoSaldo = saldoAtual + (saldoAtual * taxaDeJuros)
  public void updateBalance() {

    // balance é protected na classe Account
    // Por isso pode ser acessado diretamente aqui
    balance += balance * interestRate;
  }

  // Sobrescrita do método withdraw
  // POLIMORFISMO:
  // O saque da poupança NÃO possui taxa adicional
  // Diferente da Account (taxa de 5.0) e da BusinessAccount
  @Override
  public void withdraw(double amount) {

    // Remove apenas o valor sacado do saldo
    // Sem taxas extras
    balance -= amount;
  }
}
