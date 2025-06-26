package secao4_estrutura_sequencial;

// Importação das classes necessárias para o funcionamento do programa
import java.util.Locale;
import java.util.Scanner;

// Declaração da classe Retangulo
public class Retangulo {

  // Método principal que é executado quando o programa inicia
  public static void main(String[] args) {
    // Configuração do local padrão para os EUA para garantir que números com ponto
    // decimal sejam interpretados corretamente
    Locale.setDefault(Locale.US);

    // Criação de um objeto Scanner para ler dados de entrada do usuário através do
    // console
    Scanner sc = new Scanner(System.in);

    // Declaração de variáveis para armazenar as dimensões do retângulo e os
    // resultados dos cálculos
    double base, altura, valor_Area, perimetro, diagonal, calculo;

    // Leitura do valor da base do retângulo inserido pelo usuário
    base = sc.nextDouble();
    // Leitura do valor da altura do retângulo inserido pelo usuário
    altura = sc.nextDouble();

    // Cálculo da área do retângulo
    valor_Area = base * altura;
    // Cálculo do perímetro do retângulo
    perimetro = 2 * (base + altura);
    // Cálculo preliminar da diagonal usando o teorema de Pitágoras
    calculo = Math.pow(base, 2) + Math.pow(altura, 2);
    // Cálculo final da diagonal do retângulo
    diagonal = Math.sqrt(calculo);

    // Impressão da área do retângulo com quatro casas decimais
    System.out.printf("AREA = %.4f%n", valor_Area);
    // Impressão do perímetro do retângulo com quatro casas decimais
    System.out.printf("PERIMETRO = %.4f%n", perimetro);
    // Impressão da diagonal do retângulo com quatro casas decimais
    System.out.printf("DIAGONAL = %.4f%n", diagonal);

    // Fechamento do scanner para liberar os recursos associados
    sc.close();
  }
}
