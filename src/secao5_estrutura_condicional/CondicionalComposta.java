package secao5_estrutura_condicional;

import java.util.Scanner;

public class CondicionalComposta {

  public static void main(String[] args) {
    // Criando um objeto Scanner para receber entrada do usuário
    Scanner sc = new Scanner(System.in);
    // Declarando a variável para armazenar o número de horas
    int hora;
    // Solicitando ao usuário que insira o número de horas
    System.out.println("Quantas horas?");
    hora = sc.nextInt(); // Lendo o valor inserido pelo usuário

    // Verificando se a hora é menor que 12
    if (hora < 12) {
      System.out.println("Bom dia"); // Se for menor que 12, imprime "Bom dia"
    } else {
      System.out.println("Boa tarde"); // Se não, imprime "Boa tarde"
    }
    // Fechando o Scanner para liberar recursos
    sc.close();
  }
}
