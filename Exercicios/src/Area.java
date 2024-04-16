// Define uma classe chamada "Area".
public class Area {

  // Método principal que é executado quando o programa Java é iniciado.
  public static void main(String[] args) {

      // Declaração de quatro variáveis do tipo double.
      double b, B, h, area;

      // Inicializa a variável 'b' com o valor 6.0, representando a base menor do trapézio.
      b = 6.0;
      // Inicializa a variável 'B' com o valor 8.0, representando a base maior do trapézio.
      B = 8.0;
      // Inicializa a variável 'h' com o valor 5.0, representando a altura do trapézio.
      h = 5.0;

      // Calcula a área do trapézio usando a fórmula ((base menor + base maior) / 2) * altura.
      area = (b + B) / 2.0 * h;

      // Imprime o valor calculado da área no console.
      System.out.println(area);
  }
}
