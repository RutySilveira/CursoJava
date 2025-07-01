package exercicios_secao4; // Define o pacote onde a classe está localizada

import java.util.Locale; // Importa a classe Locale para configurar o formato numérico (usa ponto como separador decimal)
import java.util.Scanner; // Importa a classe Scanner para leitura de dados pelo teclado

public class Uri1010 {
  public static void main(String[] args) {
    // Define o padrão regional para usar ponto como separador decimal (ex: 15.50 ao
    // invés de 15,50)
    Locale.setDefault(Locale.US);

    // Cria um objeto Scanner para ler a entrada do usuário (entrada padrão)
    Scanner sc = new Scanner(System.in);

    // Declaração das variáveis para armazenar os códigos das peças, quantidade e
    // valores unitários
    int codPeca1, nPeca1, codPeca2, nPeca2;
    double valorPeca1, valorPeca2, total;

    // Lê o código da primeira peça, a quantidade e o valor unitário da peça 1
    codPeca1 = sc.nextInt();
    nPeca1 = sc.nextInt();
    valorPeca1 = sc.nextDouble();

    // Lê o código da segunda peça, a quantidade e o valor unitário da peça 2
    codPeca2 = sc.nextInt();
    nPeca2 = sc.nextInt();
    valorPeca2 = sc.nextDouble();

    // Calcula o valor total a pagar: quantidade * valor unitário para as duas peças
    total = nPeca1 * valorPeca1 + nPeca2 * valorPeca2;

    // Exibe o valor total formatado com duas casas decimais
    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

    // Fecha o scanner para liberar recursos
    sc.close();
  }
}
