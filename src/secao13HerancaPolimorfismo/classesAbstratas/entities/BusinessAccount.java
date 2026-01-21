package secao13HerancaPolimorfismo.classesAbstratas.entities;

// BusinessAccount é uma classe CONCRETA que herda de Account
// Ou seja:
// ✅ Pode ser instanciada
// ✅ Herda atributos e métodos da classe Account
// ❌ Não precisa implementar métodos abstratos (porque Account não possui)
public class BusinessAccount extends Account {

  // Limite máximo de empréstimo permitido para essa conta empresarial
  private Double loanLimit;

  // Construtor padrão
  // Chama o construtor padrão da classe mãe (Account)
  // Isso garante que a parte "Account" do objeto seja corretamente inicializada
  public BusinessAccount() {
    super(); // chama Account()
  }

  // Construtor com parâmetros
  // Inicializa os atributos herdados (number, holder, balance)
  // e também o atributo específico da BusinessAccount (loanLimit)
  public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
    super(number, holder, balance); // chama o construtor da classe Account
    this.loanLimit = loanLimit;
  }

  // Getter do limite de empréstimo
  public Double getLoanLimit() {
    return loanLimit;
  }

  // Setter do limite de empréstimo
  public void setLoanLimit(Double loanLimit) {
    this.loanLimit = loanLimit;
  }

  // Método específico da BusinessAccount
  // Realiza um empréstimo para a conta
  // Regra de negócio:
  // - O valor solicitado deve ser menor ou igual ao limite permitido
  // - Caso aprovado, o valor entra no saldo
  // - Existe uma taxa fixa de 10.0 cobrada no empréstimo
  public void loan(double amount) {
    if (amount <= loanLimit) {
      // balance é protected na classe Account
      // Por isso pode ser acessado diretamente aqui
      balance += amount - 10.0;
    }
  }

  // Sobrescrita do método withdraw da classe Account
  // Aqui ocorre POLIMORFISMO:
  // - A lógica base do saque é reaproveitada
  // - Mas o comportamento é ajustado para a conta empresarial
  @Override
  public void withdraw(double amount) {

    // Chama o método withdraw da classe mãe
    // Aplica a lógica padrão:
    // amount + taxa fixa de 5.0
    super.withdraw(amount);

    // Taxa adicional específica da BusinessAccount
    // Total de taxa do saque:
    // 5.0 (Account) + 2.0 (BusinessAccount)
    balance -= 2.0;
  }
}
