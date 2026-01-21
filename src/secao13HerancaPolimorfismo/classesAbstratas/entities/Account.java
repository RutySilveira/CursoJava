package secao13HerancaPolimorfismo.classesAbstratas.entities;

// A classe Account representa um modelo genérico de conta bancária.
// Ela é ABSTRATA, ou seja:
// ❌ Não pode ser instanciada diretamente
// ✅ Serve como classe base (pai) para outras contas específicas
// Ex.: BusinessAccount, SavingsAccount, etc.
public abstract class Account {

  // Número da conta
  // private -> encapsulamento
  // Só pode ser acessado diretamente dentro da própria classe
  private Integer number;

  // Nome do titular da conta
  // Também é private para proteger os dados
  private String holder;

  // Saldo da conta
  // protected -> pode ser acessado:
  // 1) Pela própria classe
  // 2) Pelas classes filhas (herança)
  // Isso é comum quando subclasses precisam manipular o saldo
  protected Double balance;

  // Construtor padrão (sem parâmetros)
  // Necessário para frameworks, herança ou criação flexível de objetos
  public Account() {
  }

  // Construtor com parâmetros
  // Usado para criar uma conta já inicializada
  public Account(Integer number, String holder, Double balance) {
    this.number = number; // this.number -> atributo da classe
    this.holder = holder; // holder -> parâmetro recebido
    this.balance = balance;
  }

  // Getter do número da conta
  // Permite acessar o valor do atributo number de forma controlada
  public Integer getNumber() {
    return number;
  }

  // Setter do número da conta
  // Permite modificar o número da conta, se necessário
  public void setNumber(Integer number) {
    this.number = number;
  }

  // Getter do titular da conta
  public String getHolder() {
    return holder;
  }

  // Setter do titular da conta
  public void setHolder(String holder) {
    this.holder = holder;
  }

  // Getter do saldo
  // Note que NÃO existe um setter para balance
  // Isso é uma boa prática para evitar alterações diretas no saldo
  public Double getBalance() {
    return balance;
  }

  // Método de saque (withdraw)
  // Recebe o valor que será sacado
  // Regra de negócio:
  // - O valor sacado inclui uma taxa fixa de 5.0
  // - Essa implementação pode ser sobrescrita (@Override) em subclasses
  public void withdraw(double amount) {
    balance -= amount + 5.0;
  }

  // Método de depósito
  // Adiciona o valor informado ao saldo
  // Método comum a todas as contas
  public void deposit(double amount) {
    balance += amount;
  }
}
