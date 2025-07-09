package secao4EstruturaSequencial;

// Importação das classes Locale e Scanner do pacote java.util
import java.util.Locale;
import java.util.Scanner;

// Declaração da classe ValorAreaTerreno
public class ValorAreaTerreno {

  // Método principal, ponto de entrada do programa
  public static void main(String[] args) {
    // Define o local padrão para o Locale dos Estados Unidos, isso afeta
    // formatações como a separação de decimais (. ao invés de ,)
    Locale.setDefault(Locale.US);

    // Cria um objeto Scanner para capturar a entrada de dados do usuário
    Scanner sc = new Scanner(System.in);

    // Declaração de variáveis para armazenar as dimensões do terreno e o valor por
    // metro quadrado
    double largura, comprimento, valor_Metro, valorFinalTerreno, area;

    // Leitura da largura do terreno a partir do console
    largura = sc.nextDouble();
    // Leitura do comprimento do terreno a partir do console
    comprimento = sc.nextDouble();
    // Leitura do valor do metro quadrado a partir do console
    valor_Metro = sc.nextDouble();

    // Cálculo da área do terreno
    area = largura * comprimento;
    // Cálculo do valor final do terreno multiplicando a área pelo valor do metro
    // quadrado
    valorFinalTerreno = area * valor_Metro;

    // Exibição da área do terreno com duas casas decimais
    System.out.printf("AREA = %.2f%n", area);
    // Exibição do preço do terreno com duas casas decimais
    System.out.printf("PRECO = %.2f%n", valorFinalTerreno);

    // Fechamento do scanner para liberar recursos associados
    sc.close();
  }
}
