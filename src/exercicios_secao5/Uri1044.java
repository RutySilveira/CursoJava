/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. */

package exercicios_secao5; // Declara o pacote onde o arquivo está localizado

import java.util.Scanner; // Importa a classe Scanner para leitura de dados

public class Uri1044 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Cria o Scanner para leitura

    int a = sc.nextInt();
    int b = sc.nextInt();

    // Verifica se A é múltiplo de B ou B é múltiplo de A
    if (a % b == 0 || b % a == 0) {
      System.out.println("Sao Multiplos");
    } else {
      System.out.println("Nao sao Multiplos");
    }

    sc.close(); // Fecha o Scanner
  }
}
