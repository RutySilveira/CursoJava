package secao13HerancaPolimorfismo.upcastingDowncasting.application;

import secao13HerancaPolimorfismo.upcastingDowncasting.entities.Account;
import secao13HerancaPolimorfismo.upcastingDowncasting.entities.BusinessAccount;
import secao13HerancaPolimorfismo.upcastingDowncasting.entities.SavingsAccount;

public class Program {

  public static void main(String[] args) {

    // Criação de um objeto do tipo Account
    // Referência e objeto são do mesmo tipo
    Account acc = new Account(1001, "Alex", 0.0);

    // Criação de um objeto do tipo BusinessAccount
    BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

    // ======================
    // UPCASTING
    // ======================

    // Upcasting explícito
    // A referência Account aponta para um objeto BusinessAccount
    // É sempre seguro e não precisa de casting explícito
    Account acc1 = bacc;

    // Upcasting implícito
    // Um objeto BusinessAccount é atribuído a uma referência Account
    Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);

    // Upcasting implícito
    // Um objeto SavingsAccount é atribuído a uma referência Account
    Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

    // ======================
    // DOWNCASTING
    // ======================

    // Downcasting explícito
    // A referência Account é convertida para BusinessAccount
    // Permitido porque acc2 realmente aponta para um objeto BusinessAccount
    BusinessAccount acc4 = (BusinessAccount) acc2;
    acc4.loan(100.0); // método específico de BusinessAccount

    // Exemplo de downcasting inseguro (comentado)
    // acc3 aponta para um objeto SavingsAccount
    // Tentar convertê-lo para BusinessAccount causaria ClassCastException
    // BusinessAccount acc5 = (BusinessAccount) acc3;

    // Verificação segura com instanceof
    // Só executa se o objeto for realmente do tipo BusinessAccount
    if (acc3 instanceof BusinessAccount) {
      BusinessAccount acc5 = (BusinessAccount) acc3;
      acc5.loan(200.0);
      System.out.println("Loan!");
    }

    // Verificação segura com instanceof
    // Aqui verificamos se o objeto é do tipo SavingsAccount
    if (acc3 instanceof SavingsAccount) {
      SavingsAccount acc5 = (SavingsAccount) acc3;
      acc5.updateBalance(); // método específico da SavingsAccount
      System.out.println("Update!");
    }
  }
}
