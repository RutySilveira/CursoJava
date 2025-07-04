package secao6_estrutura_repetitiva;

import java.util.Scanner;

public class SomaComWhile {

  public static void main(String[] args) {
    // Criação de um objeto Scanner para ler a entrada do usuário
    Scanner sc = new Scanner(System.in);

    // Leitura do primeiro número inteiro fornecido pelo usuário
    int x = sc.nextInt();
    // Inicializa a variável soma com zero
    int soma = 0;

    // Enquanto o valor de x não for zero, o loop continua
    while (x != 0) {
      // Adiciona o valor de x à variável soma
      soma = soma + x;
      // Lê o próximo valor do usuário
      x = sc.nextInt();
    }

    // Imprime a soma total dos valores fornecidos
    System.out.println(soma);

    // Fecha o objeto Scanner para evitar vazamento de recursos
    sc.close();
  }
}
