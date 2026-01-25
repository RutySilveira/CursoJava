package secao14TratamentoDeExcecoes.TryCatch.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    // Scanner para ler dados digitados pelo usuário no console
    Scanner sc = new Scanner(System.in);

    try {
      /*
       * Lê uma linha inteira digitada pelo usuário
       * Exemplo de entrada: "Maria João Pedro"
       * O método split(" ") quebra a string em várias partes,
       * usando o espaço como separador, e armazena tudo no vetor 'vect'
       */
      String[] vect = sc.nextLine().split(" ");

      /*
       * Lê um número inteiro que representa a posição
       * do elemento que o usuário quer acessar no vetor
       */
      int position = sc.nextInt();

      /*
       * Tenta acessar o elemento do vetor na posição informada
       * Se a posição não existir, ocorrerá uma exceção
       */
      System.out.println(vect[position]);

    } catch (ArrayIndexOutOfBoundsException e) {
      /*
       * Essa exceção ocorre quando o usuário informa
       * uma posição que não existe no vetor
       * Exemplo: vetor tem tamanho 3 e o usuário digita posição 5
       */
      System.out.println("Invalid position!");

    } catch (InputMismatchException e) {
      /*
       * Essa exceção ocorre quando o usuário digita algo
       * que não é um número inteiro ao usar sc.nextInt()
       * Exemplo: digitar uma letra ou texto
       */
      System.out.println("Input Error!");
    }

    // Esta linha é executada independentemente de erro ou não
    System.out.println("End of program");

    // Fecha o Scanner para liberar o recurso
    sc.close();
  }

}
