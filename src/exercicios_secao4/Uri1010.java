/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

// Define o pacote onde o arquivo está localizado
package exercicios_secao4;

// Importa as classes necessárias para entrada de dados e formatação numérica
import java.util.Locale;
import java.util.Scanner;

// Nome da classe (nesse caso está usando o nome do exercício, como no URI/Beecrowd)
public class Uri1010 {

  public static void main(String[] args) {

    // Define o padrão de formatação numérica (ponto como separador decimal)
    Locale.setDefault(Locale.US);

    // Cria o Scanner para ler dados do teclado
    Scanner sc = new Scanner(System.in);

    // Declaração de variáveis: código e quantidade de cada peça, valor unitário e
    // valor total
    int codPeca1, codPeca2, qtdPeca1, qtdPeca2;
    double valorPeca1, valorPeca2, valorTotal;

    // Leitura dos dados da primeira peça
    codPeca1 = sc.nextInt(); // Código da peça 1 (não é usado no cálculo, mas deve ser lido)
    qtdPeca1 = sc.nextInt(); // Quantidade da peça 1
    valorPeca1 = sc.nextDouble(); // Valor unitário da peça 1

    // Leitura dos dados da segunda peça
    codPeca2 = sc.nextInt(); // Código da peça 2 (idem)
    qtdPeca2 = sc.nextInt(); // Quantidade da peça 2
    valorPeca2 = sc.nextDouble(); // Valor unitário da peça 2

    // Cálculo do valor total a pagar pelas duas peças
    valorTotal = qtdPeca1 * valorPeca1 + qtdPeca2 * valorPeca2;

    // Exibe o valor total formatado com duas casas decimais
    System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

    // Fecha o Scanner
    sc.close();
  }

}
