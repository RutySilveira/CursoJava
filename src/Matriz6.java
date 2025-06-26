
// Importa as classes necessárias para utilização do Scanner e configuração de Locale.
import java.util.Scanner;
import java.util.Locale;

// Declaração da classe pública Matriz6.
public class Matriz6 {

  // Método principal, que é o ponto de entrada do programa.
  public static void main(String[] args) {

    // Define o Locale padrão para os Estados Unidos, o que afeta a formatação de
    // números (ponto como separador decimal).
    Locale.setDefault(Locale.US);

    // Cria um objeto Scanner para ler a entrada do usuário.
    Scanner sc = new Scanner(System.in);

    // Solicita ao usuário que informe os valores de m (número de linhas) e n
    // (número de colunas) da matriz.
    int m = sc.nextInt(); // Número de linhas da matriz
    int n = sc.nextInt(); // Número de colunas da matriz

    // Declaração e inicialização da matriz mat com m linhas e n colunas.
    int[][] mat = new int[m][n];

    // Preenche a matriz com valores inteiros fornecidos pelo usuário.
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        mat[i][j] = sc.nextInt(); // Lê o próximo inteiro da entrada e atribui à posição [i][j] da matriz.
      }
    }

    // Imprime uma linha com o texto "VALORES NEGATIVOS:".
    System.out.println("VALORES NEGATIVOS:");

    // Percorre a matriz e imprime os valores negativos encontrados.
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (mat[i][j] < 0) { // Verifica se o elemento da matriz é negativo.
          System.out.println(mat[i][j]); // Imprime o valor negativo.
        }
      }
    }

    // Fecha o Scanner para liberar recursos.
    sc.close();
  }
}
