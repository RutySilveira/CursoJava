package secao5EstruturaCondicional;

import java.util.Scanner;

public class SwitchCase {
  public static void main(String[] args) {
    // Criando um objeto Scanner para receber entrada do usuário a partir do console
    Scanner sc = new Scanner(System.in);

    // Solicitando e lendo um número inteiro fornecido pelo usuário
    int x = sc.nextInt();

    // Declarando uma variável para armazenar o nome do dia da semana
    String dia;

    // Usando a estrutura switch-case para determinar o nome do dia da semana com
    // base no número fornecido
    switch (x) {
      case 1:
        dia = "domingo";
        break;
      case 2:
        dia = "segunda";
        break;
      case 3:
        dia = "terca";
        break;
      case 4:
        dia = "quarta";
        break;
      case 5:
        dia = "quinta";
        break;
      case 6:
        dia = "sexta";
        break;
      case 7:
        dia = "sabado";
        break;
      default:
        dia = "valor invalido"; // Caso o número não corresponda a nenhum dia da semana
        break;
    }

    // Imprimindo o nome do dia da semana ou uma mensagem de valor inválido
    System.out.println("Dia da semana: " + dia);

    // Fechando o Scanner para liberar recursos
    sc.close();
  }
}
