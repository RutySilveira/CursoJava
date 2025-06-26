import java.util.Scanner; // Importa a classe Scanner do pacote java.util para entrada de dados do usuário.

public class VetorComForIt { // Declaração da classe VetorComForIt.

  public static void main(String[] args) { // Método principal onde o programa começa sua execução.

    Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do usuário.

    int n = sc.nextInt(); // Lê um inteiro fornecido pelo usuário, que indica o número de nomes a serem
                          // lidos.
    String[] nomes = new String[n]; // Cria um array de strings para armazenar os nomes fornecidos pelo usuário.

    // Loop para ler os nomes fornecidos pelo usuário e armazená-los no array de
    // nomes.
    for (int i = 0; i < n; i++) {
      nomes[i] = sc.next(); // Lê o próximo nome fornecido pelo usuário e o armazena no array de nomes.
    }

    System.out.println("Nomes Lidos:"); // Imprime uma mensagem indicando que os nomes foram lidos.

    // Loop for-each (for-it) para percorrer o array de nomes e imprimir cada nome.
    for (String s : nomes) { // Para cada elemento 's' no array de nomes...
      System.out.println(s); // Imprime o nome.
    }

    sc.close(); // Fecha o objeto Scanner para liberar recursos.

  }
}
