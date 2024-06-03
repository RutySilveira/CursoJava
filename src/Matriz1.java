import java.util.Scanner; // Importa a classe Scanner, necessária para ler a entrada do usuário.

public class Matriz1 { // Define a classe Matriz1.

  public static void main(String[] args) { // Método principal, que é o ponto de entrada do programa.

    Scanner sc = new Scanner(System.in); // Cria uma instância de Scanner para ler a entrada do teclado.

    int n = sc.nextInt(); // Lê um inteiro da entrada do usuário, que será a dimensão da matriz quadrada.

    int[][] mat = new int[n][n]; // Declara e inicializa uma matriz quadrada de inteiros com dimensão n x n.

    for (int i = 0; i < n; i++) { // Loop externo que itera sobre cada linha da matriz.
      for (int j = 0; j < n; j++) { // Loop interno que itera sobre cada coluna da linha atual.
        mat[i][j] = 1 + i + j; // Calcula e armazena o valor em mat[i][j]. Cada elemento recebe o valor 1 +
        // índice da linha + índice da coluna.
      }
    }

    for (int i = 0; i < n; i++) { // Loop externo para imprimir a matriz, iterando sobre cada linha.
      for (int j = 0; j < n; j++) { // Loop interno para imprimir os valores de cada coluna da linha atual.
        System.out.print(mat[i][j] + " "); // Imprime o valor atual seguido de um espaço.
      }
      System.out.println(); // Após imprimir todos os valores de uma linha, insere uma quebra de linha.
    }

    sc.close(); // Fecha o objeto Scanner para liberar o recurso associado.
  }
}
