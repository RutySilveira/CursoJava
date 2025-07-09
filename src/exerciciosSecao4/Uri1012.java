package exerciciosSecao4; // Define o pacote onde a classe está localizada

import java.util.Locale; // Importa a classe Locale para configurar o formato numérico (usa ponto como separador decimal)
import java.util.Scanner; // Importa a classe Scanner para leitura de dados pelo teclado

public class Uri1012 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US); // Para usar ponto decimal

    Scanner sc = new Scanner(System.in);

    final double PI = 3.14159; // Constante PI

    // Declaração das variáveis que receberão os valores de entrada
    double a, b, c;

    // Leitura dos três valores do usuário
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();

    // Cálculo das áreas das figuras geométricas
    double triangulo_ret = (a * c) / 2;
    double circulo = PI * c * c;
    double trapezio = ((a + b) * c) / 2;
    double quadrado = b * b;
    double retangulo = a * b;

    // Impressão dos resultados com 3 casas decimais
    System.out.printf("TRIANGULO: %.3f%n", triangulo_ret);
    System.out.printf("CIRCULO: %.3f%n", circulo);
    System.out.printf("TRAPEZIO: %.3f%n", trapezio);
    System.out.printf("QUADRADO: %.3f%n", quadrado);
    System.out.printf("RETANGULO: %.3f%n", retangulo);

    sc.close();
  }
}
