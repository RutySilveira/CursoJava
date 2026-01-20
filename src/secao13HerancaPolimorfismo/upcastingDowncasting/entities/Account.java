package secao13HerancaPolimorfismo.upcastingDowncasting.entities;

// Classe Account (Conta)
// Superclasse que servirá como base para outras classes
// Muito usada em exemplos de upcasting e downcasting
public class Account {

  // Número da conta
  private Integer number;

  // Nome do titular da conta
  private String holder;

  // Saldo da conta
  // protected permite que subclasses acessem diretamente esse atributo
  protected Double balance;

  // Construtor padrão
  // Necessário para herança e para criação de objetos sem parâmetros
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

  // Método de saque
  // Pode ser sobrescrito (override) pelas subclasses
  // Importante para exemplos de polimorfismo
  public void withdraw(double amount) {
    balance -= amount;
  }

  // Método de depósito
  // Soma o valor informado ao saldo da conta
  public void deposit(double amount) {
    balance += amount;
  }
}
