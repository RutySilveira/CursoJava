// Define o pacote onde esta classe está localizada
package exerciciosSecao8;

// Importa a classe Locale, que permite configurar a formatação de números (ex: ponto em vez de vírgula)
import java.util.Locale;
// Importa a classe Scanner para permitir a leitura de dados digitados pelo usuário no console
import java.util.Scanner;

// Importa a classe Rectangle, que está definida em outro pacote (provavelmente contém os métodos area(), perimeter() e diagonal())
import secao8IntroducaoPOO.entities.Rectangle;

// Define a classe principal chamada ExRetangulo
public class ExRetangulo {
  // Método principal, ponto de entrada da aplicação
  public static void main(String[] args) {

    // Define o padrão de localização para os EUA, garantindo que o separador
    // decimal seja ponto (.)
    Locale.setDefault(Locale.US);

    // Cria um objeto Scanner para ler dados do teclado
    Scanner sc = new Scanner(System.in);

    // Declara uma variável do tipo Rectangle
    Rectangle x;
    // Instancia o objeto x como um novo Rectangle
    x = new Rectangle();

    // Solicita ao usuário que informe a largura e altura do retângulo
    System.out.println("Enter rectangle width and height: ");
    x.width = sc.nextDouble(); // Lê a largura informada pelo usuário
    x.height = sc.nextDouble(); // Lê a altura informada pelo usuário

    // Exibe a área do retângulo, formatada com duas casas decimais
    System.out.printf("AREA: %.2f%n", x.area());
    // Exibe o perímetro do retângulo
    System.out.printf("PERIMETER: %.2f%n", x.perimeter());
    // Exibe a diagonal do retângulo
    System.out.printf("DIAGONAL: %.2f%n", x.diagonal());

    // Fecha o Scanner (boa prática para evitar vazamentos de recursos)
    sc.close();
  }
}
