import java.util.Scanner;

public class Matriz4 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int cont = 0;

    int[][] mat = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        mat[i][j] = sc.nextInt();
      }
    }

    System.out.println("DIAGONAL PRINCIPAL:");
    for (int i = 0; i < n; i++) {
      System.out.print(mat[i][i] + " ");
    }
    System.out.println();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (mat[i][j] < 0) {
          cont = cont + 1;
        }
      }
    }

    System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);

    sc.close();
  }
}
