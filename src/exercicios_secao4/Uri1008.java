/* 
  Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
  o valor que recebe por hora e calcula o salário desse funcionário. 
  A seguir, mostre o número e o salário do funcionário, com duas casas decimais. 
*/

// Define o pacote onde o arquivo está localizado (nome em minúsculo, conforme convenção Java)
package exercicios_secao4;

// Importa classes para entrada de dados e controle de formatação numérica
import java.util.Locale;
import java.util.Scanner;

// Declara a classe principal
public class Uri1008 {

  // Método principal da aplicação
  public static void main(String[] args) {

    // Define o formato de números para o padrão dos EUA (usa ponto como separador
    // decimal)
    Locale.setDefault(Locale.US);

    // Cria o objeto Scanner para ler entradas do teclado
    Scanner sc = new Scanner(System.in);

    // Declara variáveis: código do funcionário, horas, valor por hora e salário
    int codFuncionario, horasTrabalhadas;
    double valorHora, salario;

    // Lê os dados de entrada: código, horas trabalhadas e valor por hora
    codFuncionario = sc.nextInt();
    horasTrabalhadas = sc.nextInt();
    valorHora = sc.nextDouble();

    // Calcula o salário: multiplicação das horas pelo valor da hora
    salario = horasTrabalhadas * valorHora;

    // Exibe o código do funcionário
    System.out.println("NUMBER = " + codFuncionario);

    // Exibe o salário com duas casas decimais, no formato solicitado
    System.out.printf("SALARY = U$ %.2f%n", salario);

    // Fecha o Scanner para liberar os recursos
    sc.close();

  }

}
