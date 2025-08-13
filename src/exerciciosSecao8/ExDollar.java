package exerciciosSecao8;
// Define o pacote onde a classe ExDollar está localizada

import java.util.Locale;
// Importa a classe Locale para configurar o padrão de formatação numérica (por exemplo, ponto como separador decimal)

import java.util.Scanner;
// Importa a classe Scanner para ler dados do usuário no console

import secao8IntroducaoPOO.util.CurrencyConverter;
// Importa a classe CurrencyConverter que contém o método para converter de dólar para real

public class ExDollar {
  // Declaração da classe principal do programa

  public static void main(String[] args) {
    // Método principal que será executado ao iniciar o programa

    Locale.setDefault(Locale.US);
    // Define o padrão de formatação para os EUA (importante para usar ponto como
    // separador decimal)

    Scanner sc = new Scanner(System.in);
    // Cria o objeto Scanner para leitura de dados do usuário

    System.out.print("What is the dollar price? ");
    // Solicita que o usuário informe o valor do dólar

    double dollarPrice = sc.nextDouble();
    // Lê o valor digitado e armazena na variável dollarPrice

    System.out.print("How many dollars will be bought? ");
    // Solicita a quantidade de dólares que será comprada

    double amount = sc.nextDouble();
    // Lê a quantidade de dólares digitada e armazena na variável amount

    double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
    // Chama o método estático da classe CurrencyConverter que realiza o cálculo da
    // conversão

    System.out.printf("Amount to be paid in reais = %.2f%n", result);
    // Imprime o valor convertido em reais, formatado com duas casas decimais

    sc.close();
    // Fecha o Scanner para liberar recursos
  }

}
