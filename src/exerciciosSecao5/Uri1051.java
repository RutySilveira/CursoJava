/* Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais. */

// Pacote onde o arquivo está localizado
package exerciciosSecao5;

// Importa classes para configurar o formato numérico e para entrada de dados
import java.util.Locale;
import java.util.Scanner;

// Classe principal do programa
public class Uri1051 {

  // Método principal (ponto de entrada do programa)
  public static void main(String[] args) {

    // Define a localização padrão como EUA para usar ponto como separador decimal
    Locale.setDefault(Locale.US);

    // Cria um Scanner para ler dados do teclado
    Scanner sc = new Scanner(System.in);

    double salario, imposto;

    salario = sc.nextDouble();

    if (salario <= 2000.00) {
      imposto = 0.0;
    } else if (salario < 3000.00) {
      imposto = (salario - 2000.0) * 0.08;
    } else if (salario <= 4500.0) {
      imposto = (((salario - 3000.0) * 0.18) + 1000.0 * 0.08);
    } else {
      imposto = ((((salario - 4500.0) * 0.28) + 1500.0 * 0.18) + 1000.0 * 0.08);
    }

    if (imposto == 0.0) {
      System.out.println("Isento");
    } else {
      System.out.printf("R$ %.2f%n", imposto);
    }

    sc.close();

  }
}