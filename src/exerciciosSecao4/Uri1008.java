package exerciciosSecao4; // Define o pacote onde a classe está localizada

import java.util.Locale; // Importa a classe Locale para configurar o formato numérico (usa ponto como separador decimal)
import java.util.Scanner; // Importa a classe Scanner para leitura de dados pelo teclado

public class Uri1008 { // Declaração da classe principal com o nome exigido pelo exercício
  public static void main(String[] args) { // Método principal – ponto de entrada do programa
    Locale.setDefault(Locale.US); // Define o padrão de formatação numérica para os EUA (ex: 3.50 em vez de 3,50)

    Scanner sc = new Scanner(System.in); // Cria o objeto Scanner para capturar entradas do usuário

    // Declaração de variáveis
    int codFuncionario, horasTrabalhadas;
    double valorHora, salarioFinal;

    // Lê os dados de entrada
    codFuncionario = sc.nextInt(); // Código do funcionário
    horasTrabalhadas = sc.nextInt(); // Total de horas trabalhadas
    valorHora = sc.nextDouble(); // Valor recebido por hora

    // Cálculo do salário final
    salarioFinal = horasTrabalhadas * valorHora;

    // Exibição dos resultados no formato especificado
    System.out.println("NUMBER = " + codFuncionario);
    System.out.printf("SALARY = U$ %.2f%n", salarioFinal); // %.2f garante 2 casas decimais

    sc.close(); // Fecha o Scanner para liberar recursos
  }
}
