import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário.

public class Matriz3 { // Define a classe Matriz3.

  public static void main(String[] args) { // Método principal que serve como ponto de entrada para o programa.

    Scanner sc = new Scanner(System.in); // Cria uma instância de Scanner para capturar entrada do teclado.

    int m = sc.nextInt(); // Lê um inteiro do usuário que define as dimensões da matriz quadrada (m x m).

    int[][] mat = new int[m][m]; // Cria uma matriz quadrada de inteiros de tamanho m x m.

    for (int i = 0; i < m; i++) {
      mat[3][i] = 10; // Define todos os elementos da quarta linha (índice 3) para 10.
    }
    for (int i = 0; i < m; i++) {
      mat[i][4] = 10 * i; // Define todos os elementos da quinta coluna (índice 4) para 10 vezes o índice
                          // da linha.
      mat[i][i] = 50; // Define todos os elementos da diagonal principal para 50.
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(mat[i][j] + " "); // Imprime cada elemento da matriz seguido por um espaço.
      }
      System.out.println(); // Após imprimir todos os elementos de uma linha, imprime uma quebra de linha.
    }

    sc.close(); // Fecha o objeto Scanner para liberar o recurso associado.
  }
}
