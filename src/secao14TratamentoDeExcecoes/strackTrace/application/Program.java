package secao14TratamentoDeExcecoes.strackTrace.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    // O programa começa aqui (método main)
    // Ele chama o method1
    method1();

    // Essa linha só será executada depois que method1 terminar
    System.out.println("End of program");
  }

  public static void method1() {

    // Indica o início da execução do method1
    System.out.println("***METHOD1 START***");

    // method1 chama o method2
    method2();

    // Essa linha só executa quando method2 termina
    System.out.println("***METHOD1 END***");
  }

  public static void method2() {

    // Indica o início da execução do method2
    System.out.println("***METHOD2 START***");

    Scanner sc = new Scanner(System.in);

    try {
      // Lê uma linha do teclado e separa os valores por espaço
      String[] vect = sc.nextLine().split(" ");

      // Lê um número inteiro (posição do vetor)
      int position = sc.nextInt();

      // Tenta acessar a posição informada no vetor
      System.out.println(vect[position]);

    } catch (ArrayIndexOutOfBoundsException e) {

      // Esse erro acontece quando a posição informada não existe no vetor
      System.out.println("Invalid position!");

      /*
       * e.printStackTrace() imprime o STACK TRACE
       *
       * Stack trace é o "caminho" que o programa percorreu
       * até o erro acontecer.
       *
       * Ele mostra:
       * - Em qual método o erro ocorreu
       * - Quem chamou esse método
       * - A linha exata do código onde deu problema
       *
       * Nesse caso, o stack trace vai mostrar algo como:
       * method2 -> method1 -> main
       */
      e.printStackTrace();

      // Limpa o buffer do Scanner
      sc.next();

    } catch (InputMismatchException e) {

      // Esse erro acontece se o usuário digitar algo que não é inteiro
      System.out.println("Input Error!");
    }

    // Fecha o Scanner
    sc.close();

    // Indica o fim da execução do method2
    System.out.println("***METHOD2 END***");
  }
}
