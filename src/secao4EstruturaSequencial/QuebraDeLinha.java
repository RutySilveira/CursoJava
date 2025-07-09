package secao4EstruturaSequencial;

// Importa a classe Scanner do pacote java.util para utilizar na leitura de dados de entrada
import java.util.Scanner;

// Declaração da classe QuebraDeLinha
public class QuebraDeLinha {

  // Método principal que é o ponto de entrada do programa
  public static void main(String[] args) {
    // Cria uma instância de Scanner chamada 'sc' para ler dados da entrada padrão
    // (teclado)
    Scanner sc = new Scanner(System.in);

    // Declara três variáveis de tipo String
    String s1, s2, s3;
    // Lê uma linha completa de entrada e armazena em s1
    s1 = sc.nextLine();
    // Lê a próxima linha de entrada e armazena em s2
    s2 = sc.nextLine();
    // Lê mais uma linha de entrada e armazena em s3
    s3 = sc.nextLine();

    // Exibe uma linha de cabeçalho no console
    System.out.println("DADOS DIGITADOS:");
    // Exibe o conteúdo de s1 no console
    System.out.println(s1);
    // Exibe o conteúdo de s2 no console
    System.out.println(s2);
    // Exibe o conteúdo de s3 no console
    System.out.println(s3);

    // Fecha o scanner 'sc' para liberar o recurso de leitura de entrada
    sc.close();
  }
}
