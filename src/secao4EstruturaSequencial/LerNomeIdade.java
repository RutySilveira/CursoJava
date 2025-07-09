package secao4EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

// Declaração da classe LerNomeIdade
public class LerNomeIdade {

  // Método principal, ponto de entrada do programa
  public static void main(String[] args) {
    // Configura o Locale padrão para US para garantir formatos de números corretos
    Locale.setDefault(Locale.US);

    // Cria um objeto Scanner para leitura de dados da entrada padrão (teclado)
    Scanner sc = new Scanner(System.in);

    // Declara variáveis para armazenar os nomes das duas pessoas
    String nome1, nome2;
    // Declara variáveis para armazenar as idades das duas pessoas
    int idade1, idade2;
    // Declara uma variável para armazenar a média das idades
    double media;

    // Lê o primeiro nome do usuário
    nome1 = sc.next();
    // Lê a idade correspondente ao primeiro nome
    idade1 = sc.nextInt();
    // Lê o segundo nome do usuário
    nome2 = sc.next();
    // Lê a idade correspondente ao segundo nome
    idade2 = sc.nextInt();
    // Calcula a média das idades e armazena na variável media
    media = (idade1 + idade2) / 2.0;

    // Imprime a média das idades em um formato especificado
    System.out.printf("A idade média de %s e %s é de %.1f anos%n", nome1, nome2, media);

    // Fecha o scanner para liberar recursos
    sc.close();
  }
}
