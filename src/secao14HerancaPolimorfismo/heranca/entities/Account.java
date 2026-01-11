package secao14HerancaPolimorfismo.heranca.entities;

// Classe base Account (Conta)
// Serve como superclasse para outras contas que poderão herdar seus atributos e métodos
public class Account {

  // Número da conta
  private Integer number;

  // Nome do titular da conta
  private String holder;

  // Saldo da conta
  // protected permite acesso direto pelas subclasses (herança)
  protected Double balance;

  // Construtor padrão (necessário para frameworks e criação sem parâmetros)
  public Account() {
  }

  // Construtor com parâmetros para inicializar a conta
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

  // Realiza um saque subtraindo o valor do saldo
  // Esse método pode ser sobrescrito (override) por subclasses
  public void withdraw(double amount) {
    balance -= amount;
  }

  // Realiza um depósito somando o valor ao saldo
  public void deposit(double amount) {
    balance += amount;
  }
}
