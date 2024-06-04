import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário.

public class Matriz4 { // Define a classe Matriz4.

  public static void main(String[] args) { // Método principal que serve como ponto de entrada para o programa.

    Scanner sc = new Scanner(System.in); // Cria uma instância de Scanner para capturar entrada do teclado.

    int n = sc.nextInt(); // Lê um inteiro do usuário que define a dimensão da matriz quadrada (n x n).
    int cont = 0; // Inicializa um contador para armazenar o número de elementos negativos.

    int[][] mat = new int[n][n]; // Cria uma matriz quadrada de inteiros de tamanho n x n.

    for (int i = 0; i < n; i++) { // Loop sobre cada linha da matriz.
      for (int j = 0; j < n; j++) { // Loop sobre cada coluna da linha atual.
        mat[i][j] = sc.nextInt(); // Lê um inteiro da entrada do usuário e o armazena na matriz na posição [i][j].
      }
    }

    System.out.println("DIAGONAL PRINCIPAL:"); // Imprime um cabeçalho para a diagonal principal.
    for (int i = 0; i < n; i++) { // Loop para percorrer a diagonal principal da matriz.
      System.out.print(mat[i][i] + " "); // Imprime o elemento da diagonal principal na posição [i][i].
    }
    System.out.println(); // Insere uma quebra de linha após imprimir a diagonal principal.

    for (int i = 0; i < n; i++) { // Loop duplo para percorrer todas as células da matriz.
      for (int j = 0; j < n; j++) {
        if (mat[i][j] < 0) { // Verifica se o elemento atual é negativo.
          cont += 1; // Incrementa o contador se o elemento for negativo.
        }
      }
    }

    System.out.println("QUANTIDADE DE NEGATIVOS = " + cont); // Imprime a quantidade de elementos negativos encontrados.

    sc.close(); // Fecha o objeto Scanner para liberar o recurso associado.
  }
}
