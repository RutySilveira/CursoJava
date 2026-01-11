package secao12EnumeracoesComposicao.exerciciosSecao12.exercicio1.application;
// Pacote da aplicação principal (onde fica o método main)

import java.text.ParseException;
// Exceção lançada quando ocorre erro na conversão de String para Date

import java.text.SimpleDateFormat;
// Classe usada para definir e interpretar formatos de datas

import java.util.Date;
// Classe que representa datas em Java

import java.util.Locale;
// Classe usada para definir padrão de localização (ex: separador decimal)

import java.util.Scanner;
// Classe usada para entrada de dados pelo teclado

import secao12EnumeracoesComposicao.exerciciosSecao12.exercicio1.entities.Department;
import secao12EnumeracoesComposicao.exerciciosSecao12.exercicio1.entities.HourContract;
import secao12EnumeracoesComposicao.exerciciosSecao12.exercicio1.entities.Worker;
import secao12EnumeracoesComposicao.exerciciosSecao12.exercicio1.entities.enums.WorkerLevel;

public class Program {

  public static void main(String[] args) throws ParseException {
    // Método principal do programa
    // throws ParseException porque usamos sdf.parse(), que pode gerar erro

    Locale.setDefault(Locale.US);
    // Define o padrão de localização como US
    // Importante para garantir que o separador decimal seja ponto (.)

    Scanner sc = new Scanner(System.in);
    // Objeto Scanner para ler dados do teclado

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    // Define o formato de data esperado (dia/mês/ano)

    System.out.print("Enter department's name: ");
    // Solicita o nome do departamento

    String departmentName = sc.nextLine();
    // Lê o nome do departamento digitado pelo usuário

    System.out.println("Enter work data: ");
    // Apenas uma mensagem para organizar visualmente a entrada de dados

    System.out.print("Name: ");
    // Solicita o nome do trabalhador

    String workerName = sc.nextLine();
    // Lê o nome do trabalhador

    System.out.print("Level: ");
    // Solicita o nível do trabalhador (enum)

    String workerLevel = sc.nextLine();
    // Lê o nível como String (ex: JUNIOR, MID_LEVEL, SENIOR)

    System.out.print("Base salary: ");
    // Solicita o salário base do trabalhador

    double baseSalary = sc.nextDouble();
    // Lê o salário base

    Worker worker = new Worker(
        workerName, // Nome do trabalhador
        WorkerLevel.valueOf(workerLevel), // Converte a String para enum WorkerLevel
        baseSalary, // Salário base
        new Department(departmentName) // Cria o departamento (composição)
    );
    // Cria o objeto Worker já associado a um Department

    System.out.print("How many contracts to this worker? ");
    // Pergunta quantos contratos esse trabalhador possui

    int n = sc.nextInt();
    // Lê a quantidade de contratos

    for (int i = 1; i <= n; i++) {
      // Laço para cadastrar cada contrato

      System.out.println("Enter contract #" + i + " data:");
      // Indica qual contrato está sendo inserido

      System.out.print("Date (DD/MM/YYYY): ");
      // Solicita a data do contrato

      Date contractDate = sdf.parse(sc.next());
      // Lê a data como String e converte para Date usando o formato definido

      System.out.print("Value per hour: ");
      // Solicita o valor recebido por hora

      double valuePerHour = sc.nextDouble();
      // Lê o valor por hora

      System.out.print("Duration (hours): ");
      // Solicita a duração do contrato em horas

      int hours = sc.nextInt();
      // Lê a quantidade de horas trabalhadas

      HourContract contract = new HourContract(contractDate, valuePerHour, hours);
      // Cria um objeto HourContract com os dados informados

      worker.addContract(contract);
      // Adiciona o contrato à lista de contratos do trabalhador
    }

    System.out.println();
    // Linha em branco para organização da saída

    System.out.print("Enter month and year to calculate income (MM/YYYY): ");
    // Solicita o mês e ano para cálculo da renda

    String monthAndYear = sc.next();
    // Lê o mês e ano no formato MM/YYYY

    int month = Integer.parseInt(monthAndYear.substring(0, 2));
    // Extrai os dois primeiros caracteres (MM) e converte para inteiro

    int year = Integer.parseInt(monthAndYear.substring(3));
    // Extrai o ano (YYYY) a partir da posição 3 e converte para inteiro

    System.out.println("Name: " + worker.getName());
    // Exibe o nome do trabalhador

    System.out.println("Department: " + worker.getDepartment().getName());
    // Exibe o nome do departamento associado ao trabalhador

    System.out.println(
        "Income for: " + monthAndYear + ": " +
            String.format("%.2f", worker.income(year, month)));
    // Calcula e exibe a renda do trabalhador no mês/ano informado
    // income() soma o salário base + contratos daquele mês

    sc.close();
    // Fecha o Scanner (boa prática para liberar recursos)
  }
}
