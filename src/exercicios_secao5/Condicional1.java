/* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */

package exercicios_secao5;

import java.util.Scanner;

public class Condicional1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Cria o objeto Scanner para ler entrada

    int n;

    n = sc.nextInt(); // Lê um número inteiro do usuário

    // Verifica se o número é negativo ou não
    if (n >= 0) {
      System.out.println("NAO NEGATIVO");
    } else {
      System.out.println("NEGATIVO");
    }

    sc.close(); // Fecha o Scanner para liberar recurso
  }
}
