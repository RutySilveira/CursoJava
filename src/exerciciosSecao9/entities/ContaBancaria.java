package exerciciosSecao9.entities;
// Define o pacote onde a classe está localizada, ajudando na organização do projeto.

public class ContaBancaria {
  // Atributos privados da classe (encapsulamento) para proteger os dados da conta
  private int numero; // Número da conta
  private String nome; // Nome do titular da conta
  private double saldo; // Saldo atual da conta

  // Construtor com depósito inicial
  public ContaBancaria(int numero, String nome, double dep_inicial) {
    this.numero = numero; // Inicializa o número da conta
    this.nome = nome; // Inicializa o nome do titular
    deposito(dep_inicial); // Realiza um depósito inicial chamando o método depósito
  }

  // Construtor sem depósito inicial
  public ContaBancaria(int numero, String nome) {
    this.numero = numero; // Inicializa o número da conta
    this.nome = nome; // Inicializa o nome do titular
    // saldo começa em 0 automaticamente
  }

  // Método getter para retornar o número da conta
  public int getNumero() {
    return numero;
  }

  // Método getter para retornar o nome do titular
  public String getNome() {
    return nome;
  }

  // Método setter para alterar o nome do titular
  public void setNome(String nome) {
    this.nome = nome;
  }

  // Método getter para retornar o saldo
  public double getsaldo() {
    return saldo;
  }

  // Método para realizar depósito: adiciona o valor informado ao saldo
  public void deposito(double valor_dep) {
    saldo += valor_dep;
  }

  // Método para realizar saque: desconta o valor informado + taxa fixa de 5.0
  public void saque(double valor_saq) {
    saldo -= valor_saq + 5.0;
  }

  // Sobrescrita do método toString para representar a conta como texto formatado
  public String toString() {
    return "Conta "
        + numero
        + ", Nome: "
        + nome
        + ", saldo: $ "
        + String.format("%.2f", saldo); // Formata o saldo com 2 casas decimais
  }
}
