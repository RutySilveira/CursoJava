/* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar */

package exerciciosSecao5; // Declara o pacote onde o arquivo está localizado

import java.util.Scanner; // Importa a classe Scanner para leitura de dados

public class Condicional2 {

  public static void main(String[] args) {
    // Cria o objeto Scanner que vai permitir ler a entrada do usuário
    Scanner sc = new Scanner(System.in);

    int n; // Declara uma variável para armazenar o número lido

    // Lê um número inteiro digitado pelo usuário
    n = sc.nextInt();

    // Verifica se o número é par (divisível por 2)
    if (n % 2 == 0) {
      System.out.println("PAR");
    } else {
      System.out.println("ÍMPAR");
    }

    // Fecha o Scanner para evitar vazamento de recurso
    sc.close();
  }
}
