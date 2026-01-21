package secao13HerancaPolimorfismo.classesAbstratas.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import secao13HerancaPolimorfismo.classesAbstratas.entities.Account;
import secao13HerancaPolimorfismo.classesAbstratas.entities.BusinessAccount;
import secao13HerancaPolimorfismo.classesAbstratas.entities.SavingsAccount;

public class Program {

  public static void main(String[] args) {

    /*
     * NÃO é permitido instanciar diretamente uma classe abstrata.
     * A classe Account é abstrata, portanto serve apenas como modelo/base.
     *
     * Account acc1 = new Account(1001, "Alex", 1000.0); ❌ ERRO
     */

    /*
     * Aqui ocorre POLIMORFISMO:
     * A variável é do tipo Account (classe mãe),
     * mas o objeto instanciado é de uma classe filha.
     */

    // Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
    // Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);

    // Define o padrão de localização como US
    // Isso garante que o separador decimal seja "."
    Locale.setDefault(Locale.US);

    /*
     * Criação de uma lista do tipo Account.
     * Essa é uma BOA PRÁTICA:
     * trabalhar sempre com o tipo mais genérico possível.
     *
     * A lista pode armazenar:
     * - SavingsAccount
     * - BusinessAccount
     * ou qualquer outra classe que herde de Account.
     */
    List<Account> list = new ArrayList<>();

    // Adicionando objetos de diferentes subclasses na mesma lista
    // Isso é um exemplo claro de POLIMORFISMO em coleções
    list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
    list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
    list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
    list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

    // Variável auxiliar para somar os saldos de todas as contas
    double sum = 0.0;

    /*
     * Percorre a lista usando for-each.
     * Cada elemento da lista é tratado como Account,
     * independentemente de seu tipo real.
     */
    for (Account acc : list) {
      sum += acc.getBalance(); // método comum a todas as contas
    }

    // Exibe o saldo total de todas as contas
    System.out.printf("Total balance: %.2f%n", sum);

    /*
     * Aqui ocorre POLIMORFISMO:
     * O método deposit() é chamado da mesma forma,
     * mas é aplicado a objetos diferentes.
     */
    for (Account acc : list) {
      acc.deposit(10.0);
    }

    /*
     * Percorre novamente a lista para mostrar os saldos atualizados
     * Não é necessário verificar o tipo da conta
     * porque getNumber() e getBalance() pertencem à classe Account
     */
    for (Account acc : list) {
      System.out.printf(
          "Updated balance for account %d: %.2f%n",
          acc.getNumber(),
          acc.getBalance());
    }
  }
}
