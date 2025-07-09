// Pacote onde a classe está localizada, seguindo a convenção camelCase (inicia com letra minúscula)
package secao7OutrosTopicos;

// Definição da classe Account
// Aqui é usada a convenção PascalCase: nomes de classes iniciam com letra maiúscula e cada nova palavra também tem a primeira letra maiúscula
public class Account {

  // Atributo privado que armazena o nome do titular da conta
  // Segue a convenção camelCase: começa com letra minúscula e palavras
  // subsequentes iniciam com maiúscula
  private String holder;

  // Atributo privado que armazena o saldo da conta
  // Também segue a convenção camelCase
  private Double balance;

  // Construtor da classe Account
  // PascalCase também é usado aqui, pois o nome do construtor é igual ao nome da
  // classe
  public Account(String holder, Double balance) {
    // Atribui o valor do parâmetro ao atributo da classe
    this.holder = holder;
    this.balance = balance;
  }

  // Método público que retorna o nome do titular
  // camelCase: métodos começam com letra minúscula e seguem o padrão nas palavras
  // seguintes
  public String getHolder() {
    return holder;
  }

  // Método público para depositar um valor na conta
  public void deposit(double amount) {
    balance += amount; // Adiciona o valor ao saldo
  }

  // Método público para sacar um valor da conta
  public void withdraw(double amount) {
    balance -= amount; // Subtrai o valor do saldo
  }

}
