package secao14HerancaPolimorfismo.heranca.entities;

// Classe BusinessAccount (Conta Empresarial)
// Herda atributos e métodos da classe Account
public class BusinessAccount extends Account {

  // Limite máximo de empréstimo permitido para a conta empresarial
  private Double loanLimit;

  // Construtor padrão
  // Chama o construtor padrão da superclasse Account
  public BusinessAccount() {
    super();
  }

  // Construtor com parâmetros
  // super() chama o construtor padrão da classe Account.
  // e inicializa os atributos herdados da classe Account
  // e o atributo específico da BusinessAccount

  public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
    super(number, holder, balance); // inicializa number, holder e balance da superclasse
    this.loanLimit = loanLimit; // inicializa o limite de empréstimo
  }

  // Retorna o limite de empréstimo da conta
  public Double getLoanLimit() {
    return loanLimit;
  }

  // Define/atualiza o limite de empréstimo da conta
  public void setLoanLimit(Double loanLimit) {
    this.loanLimit = loanLimit;
  }

  // Método responsável por conceder um empréstimo
  // O empréstimo só é realizado se o valor solicitado
  // for menor ou igual ao limite permitido
  public void loan(double amount) {
    if (amount <= loanLimit) {
      // Acessa diretamente o atributo balance,
      // pois ele é protected na superclasse Account
      // É descontada uma taxa fixa de 10.0 do valor do empréstimo
      balance += amount - 10.0;
    }
  }
}
