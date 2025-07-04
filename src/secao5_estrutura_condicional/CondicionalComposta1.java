package secao5_estrutura_condicional;

import java.util.Scanner; // Importa a classe Scanner do pacote java.util para ler entrada do usuário

public class CondicionalComposta1 { // Declaração da classe CondicionalComposta1

  public static void main(String[] args) { // Método principal (main) que inicia a execução do programa

    Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do teclado

    int hora; // Declaração da variável para armazenar o número de horas

    System.out.println("Quantas horas?"); // Solicita ao usuário que insira o número de horas
    hora = sc.nextInt(); // Lê o valor inserido pelo usuário

    // Verifica se a hora é menor que 12
    if (hora < 12) {
      System.out.println("Bom dia"); // Se for menor que 12, imprime "Bom dia"
    } else if (hora < 18) { // Se não for menor que 12, verifica se é menor que 18
      System.out.println("Boa tarde"); // Se for menor que 18, imprime "Boa tarde"
    } else { // Se não for nem menor que 12 nem menor que 18
      System.out.println("Boa noite"); // Imprime "Boa noite"
    }

    sc.close(); // Fecha o Scanner para liberar recursos
  }
}
