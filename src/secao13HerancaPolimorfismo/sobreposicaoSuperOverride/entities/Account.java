package secao13HerancaPolimorfismo.sobreposicaoSuperOverride.entities;

// Classe Account
// Superclasse que define o comportamento padrão das contas
public class Account {

  // Número da conta
  private Integer number;

  // Nome do titular da conta
  private String holder;

  // Saldo da conta
  // protected permite acesso direto pelas subclasses
  protected Double balance;

  // Construtor padrão
  public Account() {
  }

  // Construtor com parâmetros
  // Inicializa os atributos básicos da conta
  public Account(Integer number, String holder, Double balance) {
    this.number = number;
    this.holder = holder;
    this.balance = balance;
  }

  // Retorna o número da conta
  public Integer getNumber() {
    return number;
  }

  // Define/atualiza o número da conta
  public void setNumber(Integer number) {
    this.number = number;
  }

  // Retorna o nome do titular da conta
  public String getHolder() {
    return holder;
  }

  // Define/atualiza o nome do titular da conta
  public void setHolder(String holder) {
    this.holder = holder;
  }

  // Retorna o saldo atual da conta
  public Double getBalance() {
    return balance;
  }

  // Método de saque padrão da classe Account
  // Aplica uma taxa fixa de 5.0
  // Esse método pode ser sobrescrito (override) pelas subclasses
  public void withdraw(double amount) {
    balance -= amount + 5.0;
  }

  // Método de depósito
  // Soma o valor informado ao saldo da conta
  public void deposit(double amount) {
    balance += amount;
  }
}
