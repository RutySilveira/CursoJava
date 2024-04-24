import java.util.Locale;
import java.util.Scanner;

public class ValorAreaTerreno {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double largura, comprimento, valor_Metro, valorFinalTerreno, area;

    largura = sc.nextDouble();
    comprimento = sc.nextDouble();
    valor_Metro = sc.nextDouble();

    area = largura * comprimento;
    valorFinalTerreno = area * valor_Metro;

    System.out.printf("AREA = %.2f%n", area);
    System.out.printf("PRECO = %.2f%n", valorFinalTerreno);

    sc.close();
  }
}
