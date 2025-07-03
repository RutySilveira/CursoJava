/* Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação. */

// Pacote onde o arquivo está localizado
package exercicios_secao5;

// Importa classes para configurar o formato numérico e para entrada de dados
import java.util.Locale;
import java.util.Scanner;

// Classe principal do programa
public class Uri1041 {

  // Método principal (ponto de entrada do programa)
  public static void main(String[] args) {

    // Define a localização padrão como EUA para usar ponto como separador decimal
    Locale.setDefault(Locale.US);

    // Cria um Scanner para ler dados do teclado
    Scanner sc = new Scanner(System.in);

    // Declaração das variáveis que irão armazenar as coordenadas
    double x, y;

    // Lê os valores de x e y com uma casa decimal
    x = sc.nextDouble();
    y = sc.nextDouble();

    // Verifica se o ponto está na origem (x = 0 e y = 0)
    if (x == 0.0 && y == 0.0) {
      System.out.println("Origem");

      // Verifica se o ponto está sobre o eixo Y (x = 0 e y diferente de 0)
    } else if (x == 0.0) {
      System.out.println("Eixo Y");

      // Verifica se o ponto está sobre o eixo X (y = 0 e x diferente de 0)
    } else if (y == 0.0) {
      System.out.println("Eixo X");

      // Verifica se o ponto está no primeiro quadrante (x > 0 e y > 0)
    } else if (x > 0.0 && y > 0.0) {
      System.out.println("Q1");

      // Verifica se o ponto está no segundo quadrante (x < 0 e y > 0)
    } else if (x < 0.0 && y > 0.0) {
      System.out.println("Q2");

      // Verifica se o ponto está no terceiro quadrante (x < 0 e y < 0)
    } else if (x < 0.0 && y < 0.0) {
      System.out.println("Q3");

      // Se nenhuma das opções anteriores for verdadeira, o ponto está no quarto
      // quadrante (x > 0 e y < 0)
    } else {
      System.out.println("Q4");
    }

    // Fecha o Scanner (boa prática para liberar recursos)
    sc.close();
  }
}
