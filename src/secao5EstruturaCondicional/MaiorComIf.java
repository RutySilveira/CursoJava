package secao5EstruturaCondicional;

import java.util.Scanner;

public class MaiorComIf {

  public static void main(String[] args) {

    // Criando um objeto Scanner para receber entrada do usuário a partir do console
    Scanner sc = new Scanner(System.in);

    // Solicitando e lendo três números inteiros fornecidos pelo usuário
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();

    // Verificando qual dos três números é o menor usando instruções if-else
    if (n1 < n2 && n1 < n3) {
      System.out.println("MENOR = " + n1);
    } else if (n2 < n1 && n2 < n3) {
      System.out.println("MENOR = " + n2);
    } else {
      System.out.println("MENOR = " + n3);
    }
    // Fechando o Scanner para liberar recursos
    sc.close();
  }
}
