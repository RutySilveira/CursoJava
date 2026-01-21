package secao13HerancaPolimorfismo.exerciciosSecao13.exercicio2.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao13HerancaPolimorfismo.exerciciosSecao13.exercicio2.entities.Company;
import secao13HerancaPolimorfismo.exerciciosSecao13.exercicio2.entities.Individual;
import secao13HerancaPolimorfismo.exerciciosSecao13.exercicio2.entities.TaxPayer;

public class Program {

  public static void main(String[] args) {

    // Define o padrão de localização como US
    // Garante que números decimais usem ponto (.)
    Locale.setDefault(Locale.US);

    // Scanner para leitura dos dados digitados pelo usuário
    Scanner sc = new Scanner(System.in);

    /*
     * Lista do tipo TaxPayer (classe abstrata).
     * 
     * Boa prática de OO:
     * trabalhar sempre com o tipo mais genérico possível.
     * 
     * Essa lista pode armazenar:
     * - objetos do tipo Individual
     * - objetos do tipo Company
     * 
     * Isso é POLIMORFISMO.
     */
    List<TaxPayer> list = new ArrayList<TaxPayer>();

    // Pergunta quantos contribuintes serão cadastrados
    System.out.print("Enter the number of taxpayers: ");
    int N = sc.nextInt();

    /*
     * Loop para cadastrar cada contribuinte
     */
    for (int i = 1; i <= N; i++) {

      System.out.println("Taxpayer #" + i + " data:");

      // Pergunta o tipo de contribuinte
      System.out.print("Individual or company (i/c)? ");
      char type = sc.next().charAt(0);

      // Leitura do nome do contribuinte
      System.out.print("Name: ");
      String name = sc.next();

      // Leitura da renda anual
      System.out.print("Anual income: ");
      Double anualIncome = sc.nextDouble();

      /*
       * Estrutura condicional:
       * - Se for 'i', cria um Individual
       * - Caso contrário, cria um Company
       */
      if (type == 'i') {

        // Leitura dos gastos com saúde (somente para pessoa física)
        System.out.print("Health expenditures: ");
        Double healthExpenditures = sc.nextDouble();

        /*
         * Cria um objeto Individual, e adiciona na lista como TaxPayer
         */
        list.add(new Individual(name, anualIncome, healthExpenditures));

      } else {

        // Leitura do número de funcionários (somente para empresa)
        System.out.print("Number of employees: ");
        Integer numberOfEmployees = sc.nextInt();

        /*
         * Cria um objeto Company
         * e adiciona na lista como TaxPayer
         */
        list.add(new Company(name, anualIncome, numberOfEmployees));
      }
    }

    System.out.println();
    System.out.println("TAXES PAID:");

    /*
     * Percorre a lista de contribuintes.
     * 
     * Aqui ocorre POLIMORFISMO:
     * - tp.tax() chama:
     * - tax() de Individual, se for pessoa física
     * - tax() de Company, se for empresa
     * 
     * O Java decide em tempo de execução qual método usar.
     */
    for (TaxPayer tp : list) {
      System.out.println(
          tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
    }

    System.out.println();

    // Variável para somar o total de impostos pagos
    double sum = 0.0;

    /*
     * Soma o imposto de todos os contribuintes
     */
    for (TaxPayer tp : list) {
      sum += tp.tax();
    }

    // Exibe o total de impostos pagos
    System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

    // Fecha o Scanner (boa prática)
    sc.close();
  }
}
