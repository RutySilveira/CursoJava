package exerciciosSecao9;

// Importa classes necessárias
import java.util.Locale; // Para configurar o formato de números (ex: separador decimal como ponto)
import java.util.Scanner; // Para leitura de dados digitados pelo usuário

import exerciciosSecao9.entities.ContaBancaria; // Importa a classe ContaBancaria criada no outro arquivo

public class MainContaBancaria {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    // Define a localidade como EUA para usar ponto (.) como separador decimal ao
    // ler/escrever valores

    Scanner sc = new Scanner(System.in);
    // Cria um Scanner para capturar a entrada do usuário pelo teclado

    ContaBancaria conta1;
    // Variável que armazenará a conta criada

    System.out.println("Digite o numero da conta: ");
    int numero = sc.nextInt(); // Lê o número da conta

    System.out.println("Digite o nome do titular da conta: ");
    sc.nextLine(); // Consome a quebra de linha pendente após o nextInt()
    String nome = sc.nextLine(); // Lê o nome completo do titular

    System.out.print("Deseja fazer um deposito inicial (s/n)?: ");
    char resposta = sc.next().charAt(0);
    // Lê a primeira letra digitada para saber se haverá depósito inicial

    // Verifica se o usuário deseja fazer depósito inicial
    if (resposta == 's') {
      System.out.println("Digite o valor a depositar: ");
      double dep_inicial = sc.nextDouble();
      // Lê o valor do depósito inicial
      conta1 = new ContaBancaria(numero, nome, dep_inicial);
      // Cria a conta com depósito inicial usando o construtor com 3 parâmetros
    } else {
      conta1 = new ContaBancaria(numero, nome);
      // Cria a conta sem depósito inicial usando o construtor com 2 parâmetros
    }

    System.out.println();
    System.out.println("Dados da conta:");
    System.out.println(conta1);
    // Exibe os dados iniciais da conta chamando o método toString()

    System.out.println();
    System.out.print("Digite o valor para depositar: ");
    double valor_dep = sc.nextDouble();
    // Lê valor do depósito
    conta1.deposito(valor_dep);
    // Realiza o depósito
    System.out.println("Dados atualizados da conta:");
    System.out.println(conta1);
    // Exibe novamente os dados atualizados

    System.out.println();
    System.out.print("Digite o valor para saque: ");
    double valor_saq = sc.nextDouble();
    // Lê valor para saque
    conta1.saque(valor_saq);
    // Realiza o saque (com desconto da taxa de 5.0)
    System.out.println("Dados atualizados da conta:");
    System.out.println(conta1);
    // Mostra dados após o saque

    sc.close();
    // Fecha o scanner para liberar recursos
  }
}
