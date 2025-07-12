// Define o pacote onde a classe Triangle está localizada
package secao8IntroducaoPOO.entities;

// Declaração da classe Triangle
public class Triangle {

  // Atributos públicos que representam os três lados do triângulo
  public double a;
  public double b;
  public double c;

  public double area() {
    double p = (a + b + c) / 2.0;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }
}
