package secao5EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class NotaComIf {

  public static void main(String[] args) { // Método principal (main) que inicia a execução do programa

    Locale.setDefault(Locale.US); // Define o local para o formato de números (ponto como separador decimal)

    Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do teclado

    double nota1, nota2, soma; // Declaração das variáveis para armazenar as notas e a soma

    nota1 = sc.nextDouble(); // Lê a primeira nota inserida pelo usuário
    nota2 = sc.nextDouble(); // Lê a segunda nota inserida pelo usuário
                             // sc.nextDouble();)

    soma = nota1 + nota2; // Calcula a soma das duas notas

    if (soma > 60.00) { // Verifica se a soma é maior que 60
      System.out.printf("NOTA FINAL = %.1f%n", soma); // Se for, imprime a soma formatada com uma casa decimais
    } else { // Se a soma for menor ou igual a 60
      System.out.printf("NOTA FINAL = %.1f%n", soma); // Imprime a soma formatada com uma casa decimais
      System.out.println("REPROVADO"); // E imprime "REPROVADO"
    }

    sc.close(); // Fecha o Scanner para liberar recursos
  }
}
