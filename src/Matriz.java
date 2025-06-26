import java.util.Scanner; // Importa a classe Scanner, que é usada para obter entrada do usuário.

public class Matriz { // Define a classe Matriz.

  public static void main(String[] args) { // Método principal, que é o ponto de entrada do programa.

    Scanner sc = new Scanner(System.in); // Cria uma instância do Scanner para ler a entrada do teclado.

    int m = sc.nextInt(); // Lê o próximo inteiro da entrada como o número de linhas da matriz.
    int n = sc.nextInt(); // Lê o próximo inteiro da entrada como o número de colunas da matriz.

    int[][] mat = new int[m][n]; // Cria uma matriz de inteiros com m linhas e n colunas.

    for (int i = 0; i < m; i++) { // Loop para cada linha da matriz.
      for (int j = 0; j < n; j++) { // Loop para cada coluna da linha atual.
        mat[i][j] = sc.nextInt(); // Lê o próximo inteiro e o armazena na posição [i][j] da matriz.
      }
    }

    for (int i = 0; i < m; i++) { // Loop para imprimir cada linha da matriz.
      for (int j = 0; j < n; j++) { // Loop para imprimir cada elemento da linha atual.
        System.out.print(mat[i][j] + " "); // Imprime o elemento atual seguido de um espaço.
      }
      System.out.println(); // Imprime uma nova linha após todos os elementos de uma linha serem impressos.
    }

    sc.close(); // Fecha o Scanner para liberar o recurso associado.

  }
}
