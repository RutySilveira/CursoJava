package secao13HerancaPolimorfismo.sobreposicaoSuperOverride.entities;

// Classe BusinessAccount
// Subclasse de Account que sobrescreve o comportamento de saque
public class BusinessAccount extends Account {

  // Limite máximo de empréstimo da conta empresarial
  private Double loanLimit;

  // Construtor padrão
  // Chama o construtor padrão da superclasse Account
  public BusinessAccount() {
    super();
  }

  // Construtor com parâmetros
  // Inicializa os atributos herdados da classe Account
  // e o atributo específico da BusinessAccount
  public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
    super(number, holder, balance); // inicializa a parte Account do objeto
    this.loanLimit = loanLimit; // inicializa o limite de empréstimo
  }

  // Retorna o limite de empréstimo
  public Double getLoanLimit() {
    return loanLimit;
  }

  // Define/atualiza o limite de empréstimo
  public void setLoanLimit(Double loanLimit) {
    this.loanLimit = loanLimit;
  }

  // Método específico da classe BusinessAccount
  // Concede empréstimo se o valor estiver dentro do limite
  public void loan(double amount) {
    if (amount <= loanLimit) {
      // Acesso direto ao balance permitido
      // porque ele é protected na classe Account
      // Taxa fixa de 10.0 aplicada ao empréstimo
      balance += amount - 10.0;
    }
  }

  // Sobrescrita (override) do método withdraw da classe Account
  @Override
  public void withdraw(double amount) {

    // Chama o método withdraw da superclasse Account
    // Aplica a regra padrão de saque (valor + taxa de 5.0)
    super.withdraw(amount);

    // Aplica uma taxa adicional específica da BusinessAccount
    balance -= 2.0;
  }
}
