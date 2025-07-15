// Define o pacote onde a classe está localizada
package exerciciosSecao8;

// Importa a classe Locale para configurar a formatação numérica (como separador decimal)
import java.util.Locale;
// Importa a classe Scanner para leitura de dados digitados pelo usuário
import java.util.Scanner;

// Importa a classe Triangle, que está localizada no pacote entities
import secao8IntroducaoPOO.entities.Rectangle;

// Classe principal do programa
public class ExRetangulo {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    Rectangle x;
    x = new Rectangle();

    System.out.println("Enter rectangle width and height: ");
    x.width = sc.nextDouble();
    x.height = sc.nextDouble();

    System.out.printf("AREA: %.2f%n", x.area());
    System.out.printf("PERIMETER: %.2f%n", x.perimeter());
    System.out.printf("DIAGONAL: %.2f%n", x.diagonal());

    sc.close();
  }
}
