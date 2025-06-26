package exercicios_secao4;

import java.util.Scanner;
import java.util.Locale;

public class Uri1002 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    double area, raio;

    raio = sc.nextDouble();

    area = Math.PI * raio * raio;

    System.out.printf("A=%.4f", area);

    sc.close();
  }

}
