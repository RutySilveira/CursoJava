package secao5_estrutura_condicional; // Declara o pacote onde o arquivo Java está localizado

import java.util.Locale; // Importa a classe Locale para configurar o formato de números
import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário

public class CondicaoTernaria { // Declaração da classe pública chamada CondicaoTernaria

  public static void main(String[] args) { // Método principal: ponto de entrada da execução do programa

    Locale.setDefault(Locale.US);
    // Define o padrão de localização para os EUA, para garantir que os números
    // decimais usem ponto (.) em vez de vírgula (,)

    Scanner sc = new Scanner(System.in);
    // Cria um objeto Scanner para ler dados inseridos pelo usuário

    double preco, valorFinal;
    // Declara duas variáveis do tipo double: uma para o preço original e outra para
    // o valor final com desconto

    preco = sc.nextDouble();
    // Lê um número com casas decimais (double) digitado pelo usuário e armazena na
    // variável 'preco'

    // Usa expressão condicional ternária para calcular o desconto:
    // Se o preço for menor que 20.0, o desconto será de 10% do preço
    // Caso contrário, o desconto será de 5%
    double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

    valorFinal = preco - desconto;
    // Calcula o valor final subtraindo o desconto do preço original

    // Exibe os resultados formatados com duas casas decimais
    System.out.printf("Preco sem desconto: %.2f%n", preco);
    System.out.printf("Valor do desconto: %.2f%n", desconto);
    System.out.printf("Preco final com desconto: %.2f%n", valorFinal);

    sc.close();
    // Fecha o Scanner para liberar o recurso de entrada de dados
  }
}
