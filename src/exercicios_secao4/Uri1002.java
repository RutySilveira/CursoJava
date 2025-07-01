package exercicios_secao4; // Define o pacote onde a classe está localizada

import java.util.Locale; // Importa a classe Locale para definir a formatação numérica
import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class Uri1002 { // Início da definição da classe pública Uri1002
  public static void main(String[] args) { // Método principal - ponto de entrada do programa

    Locale.setDefault(Locale.US); // Define a localidade para EUA (ponto como separador decimal)

    Scanner sc = new Scanner(System.in); // Cria o Scanner para leitura de dados do teclado

    final double PI = 3.14159; // Declara uma constante para o valor de PI (não pode ser alterada)
    double raio, area; // Declara duas variáveis do tipo double

    raio = sc.nextDouble(); // Lê o valor do raio fornecido pelo usuário

    area = PI * raio * raio; // Calcula a área do círculo usando a fórmula A = π * r²

    // Imprime o resultado da área com 4 casas decimais, no formato exigido
    System.out.printf("A=%.4f%n", area);

    sc.close(); // Fecha o Scanner para liberar recursos do sistema
  }
}
