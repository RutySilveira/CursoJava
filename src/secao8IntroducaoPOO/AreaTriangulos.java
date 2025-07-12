// Define o pacote onde a classe está localizada
package secao8IntroducaoPOO;

// Importa a classe Locale para configurar a formatação numérica (como separador decimal)
import java.util.Locale;
// Importa a classe Scanner para leitura de dados digitados pelo usuário
import java.util.Scanner;

// Importa a classe Triangle, que está localizada no pacote entities
import secao8IntroducaoPOO.entities.Triangle;

// Classe principal do programa
public class AreaTriangulos {
  public static void main(String[] args) {

    // Define o formato numérico para o padrão dos EUA (usa ponto como separador
    // decimal)
    Locale.setDefault(Locale.US);

    // Cria um objeto Scanner para ler dados da entrada padrão (teclado)
    Scanner sc = new Scanner(System.in);

    // Declara dois objetos do tipo Triangle
    Triangle x, y;
    // Instancia os objetos (aloca memória e cria as instâncias)
    x = new Triangle();
    y = new Triangle();

    // Solicita ao usuário que insira as medidas do triângulo X
    System.out.println("Enter the measures of triangle X: ");
    x.a = sc.nextDouble(); // Lê o lado a de X
    x.b = sc.nextDouble(); // Lê o lado b de X
    x.c = sc.nextDouble(); // Lê o lado c de X

    // Solicita ao usuário que insira as medidas do triângulo Y
    System.out.println("Enter the measures of triangle Y: ");
    y.a = sc.nextDouble(); // Lê o lado a de Y
    y.b = sc.nextDouble(); // Lê o lado b de Y
    y.c = sc.nextDouble(); // Lê o lado c de Y

    double areaX = x.area();
    double areaY = y.area();

    // Exibe a área do triângulo X formatada com 4 casas decimais
    System.out.printf("Triangle X area: %.4f%n", areaX);
    // Exibe a área do triângulo Y formatada com 4 casas decimais
    System.out.printf("Triangle Y area: %.4f%n", areaY);

    // Compara as áreas e informa qual triângulo tem a maior área
    if (areaX > areaY) {
      System.out.println("Larger area: X");
    } else {
      System.out.println("Larger area: Y");
    }

    // Encerra o scanner para liberar recursos
    sc.close();
  }
}
