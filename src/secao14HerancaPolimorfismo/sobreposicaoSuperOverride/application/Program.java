package secao14HerancaPolimorfismo.sobreposicaoSuperOverride.application;

// Importação das classes do pacote entities
import secao14HerancaPolimorfismo.sobreposicaoSuperOverride.entities.Account;
import secao14HerancaPolimorfismo.sobreposicaoSuperOverride.entities.BusinessAccount;
import secao14HerancaPolimorfismo.sobreposicaoSuperOverride.entities.SavingsAccount;

public class Program {

  public static void main(String[] args) {

    // ======================
    // EXEMPLO 1 - Account
    // ======================

    // Referência e objeto do tipo Account
    Account acc1 = new Account(1001, "Alex", 1000.0);

    // Executa o método withdraw da própria classe Account
    // Regra: valor sacado + taxa fixa de 5.0
    acc1.withdraw(200.0);

    // Saldo esperado: 1000 - 200 - 5 = 795.0
    System.out.println(acc1.getBalance());

    // ======================
    // EXEMPLO 2 - SavingsAccount
    // ======================

    // Upcasting:
    // Referência Account apontando para um objeto SavingsAccount
    Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);

    // Mesmo com referência do tipo Account,
    // o método executado é o sobrescrito na classe SavingsAccount
    // Regra: saque SEM taxa
    acc2.withdraw(200.0);

    // Saldo esperado: 1000 - 200 = 800.0
    System.out.println(acc2.getBalance());

    // ======================
    // EXEMPLO 3 - BusinessAccount
    // ======================

    // Upcasting:
    // Referência Account apontando para um objeto BusinessAccount
    Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);

    // Executa o método sobrescrito na classe BusinessAccount
    // Regra:
    // 1) taxa padrão de Account (5.0)
    // 2) taxa adicional da BusinessAccount (2.0)
    acc3.withdraw(200.0);

    // Saldo esperado: 1000 - 200 - 5 - 2 = 793.0
    System.out.println(acc3.getBalance());
  }
}
