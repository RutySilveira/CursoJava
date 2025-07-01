/* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar */

package exercicios_secao5;

import java.util.Scanner;

public class Condicional2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Cria o objeto Scanner para ler entrada

    int n;

    n = sc.nextInt(); // Lê um número inteiro do usuário

    // Verifica se o número é par ou ímpar
    if (n % 2 == 0) {
      System.out.println("PAR");
    } else {
      System.out.println("ÍMPAR");
    }

    sc.close(); // Fecha o Scanner para liberar recurso
  }
}
