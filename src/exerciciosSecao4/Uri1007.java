package exerciciosSecao4;

import java.util.Scanner;

public class Uri1007 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Cria o Scanner para entrada de dados

    int a, b, c, d, diferenca;

    // Lê os quatro valores inteiros
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();

    // Calcula a diferença entre o produto de a*b e c*d
    diferenca = a * b - c * d;

    // Exibe o resultado no formato esperado
    System.out.println("DIFERENCA = " + diferenca);

    sc.close(); // Fecha o Scanner
  }
}
