package secao13HerancaPolimorfismo.heranca.application;

import secao13HerancaPolimorfismo.heranca.entities.BusinessAccount;

public class Program {

  public static void main(String[] args) {

    // Criação de um objeto BusinessAccount
    // number = 8010 → número da conta
    // holder = "Bob Brown" → titular da conta
    // balance = 0.0 → saldo inicial
    // loanLimit = 500.0 → limite máximo para empréstimos
    BusinessAccount account = new BusinessAccount(8010, "Bob Brown", 0.0, 500.0);

    // Exibe o saldo da conta
    // O método getBalance() é herdado da classe Account
    System.out.println(account.getBalance());
  }
}
