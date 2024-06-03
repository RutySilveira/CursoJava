import java.util.Scanner; // Importa a classe Scanner, necessária para ler entrada do usuário.

public class Matriz2 { // Define a classe Matriz2.

  public static void main(String[] args) { // Método principal, ponto de entrada do programa.

    Scanner sc = new Scanner(System.in); // Cria uma instância de Scanner para ler a entrada do teclado.

    int m = sc.nextInt(); // Lê o próximo inteiro como o número de linhas da matriz.
    int n = sc.nextInt(); // Lê o próximo inteiro como o número de colunas da matriz.
    int x = sc.nextInt(); // Lê o próximo inteiro como o valor inicial para cálculo dos valores da matriz.

    int[][] mat = new int[m][n]; // Cria uma matriz de inteiros com m linhas e n colunas.

    for (int i = 0; i < m; i++) { // Loop sobre cada linha da matriz.
      x = x + i; // Incrementa x pelo índice da linha atual a cada nova linha.
      for (int j = 0; j < n; j++) { // Loop sobre cada coluna da linha atual.
        x = x + j; // Incrementa x pelo índice da coluna atual.
        mat[i][j] = x; // Armazena o valor atualizado de x na posição [i][j] da matriz.
      }
    }

    for (int i = 0; i < m; i++) { // Loop para imprimir cada linha da matriz.
      for (int j = 0; j < n; j++) { // Loop para imprimir cada elemento das colunas na linha atual.
        System.out.print(mat[i][j] + " "); // Imprime o elemento atual seguido de um espaço.
      }
      System.out.println(); // Após imprimir todos os elementos de uma linha, insere uma quebra de linha.
    }

    sc.close(); // Fecha o Scanner para liberar o recurso associado.

  }
}
