// Define o pacote onde o arquivo está localizado (pasta do projeto)
package exercicios_secao4;

// Importa as classes necessárias:
// Locale para definir o padrão de formatação numérica (ex: ponto decimal)
// Scanner para entrada de dados do usuário
import java.util.Locale;
import java.util.Scanner;

// Declaração da classe principal do programa
public class Uri1012 {

  // Método principal da aplicação Java
  public static void main(String[] args) {

    // Define o padrão de formatação para os números (ponto como separador decimal)
    Locale.setDefault(Locale.US);

    // Cria o objeto Scanner para ler os dados do teclado
    Scanner sc = new Scanner(System.in);

    // Declaração de variáveis
    double a, b, c; // Entradas do usuário
    double triangulo, circulo, trapezio, quadrado, retangulo; // Resultados das áreas

    // Leitura de três valores do tipo double
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();

    // Cálculo da área do triângulo retângulo: (base * altura) / 2
    triangulo = (1.0 / 2.0) * a * c;

    // Cálculo da área do círculo: π * raio² (usando valor fixo de π = 3.14159)
    circulo = 3.14159 * (c * c);

    // Cálculo da área do trapézio: ((base maior + base menor) * altura) / 2
    trapezio = (1.0 / 2.0) * (a + b) * c;

    // Cálculo da área do quadrado: lado²
    quadrado = b * b;

    // Cálculo da área do retângulo: base * altura
    retangulo = a * b;

    // Impressão dos resultados formatados com 3 casas decimais
    System.out.printf("TRIANGULO: %.3f%n", triangulo);
    System.out.printf("CIRCULO: %.3f%n", circulo);
    System.out.printf("TRAPEZIO: %.3f%n", trapezio);
    System.out.printf("QUADRADO: %.3f%n", quadrado);
    System.out.printf("RETANGULO: %.3f%n", retangulo);

    // Fecha o objeto Scanner para liberar os recursos do sistema
    sc.close();
  }
}
