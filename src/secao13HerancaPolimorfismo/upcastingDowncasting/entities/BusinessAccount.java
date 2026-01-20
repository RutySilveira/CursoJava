package secao13HerancaPolimorfismo.upcastingDowncasting.entities;

// Classe BusinessAccount (Conta Empresarial)
// Subclasse de Account, usada com frequência em exemplos de upcasting e downcasting
public class BusinessAccount extends Account {

  // Limite máximo de empréstimo permitido para a conta empresarial
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
    super(number, holder, balance); // inicialização da parte Account do objeto
    this.loanLimit = loanLimit; // inicialização do limite de empréstimo
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
  // NÃO existe na superclasse Account
  // Só pode ser acessado diretamente quando a referência
  // é do tipo BusinessAccount (downcasting)
  public void loan(double amount) {
    if (amount <= loanLimit) {
      // Acesso direto ao atributo balance permitido
      // porque ele é protected na classe Account
      // É cobrada uma taxa fixa de 10.0 sobre o empréstimo
      balance += amount - 10.0;
    }
  }
}
