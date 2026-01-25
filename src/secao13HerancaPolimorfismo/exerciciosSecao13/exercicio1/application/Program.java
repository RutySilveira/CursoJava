package secao13HerancaPolimorfismo.exerciciosSecao13.application;

// Importações necessárias para trabalhar com listas, localização e entrada de dados
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao13HerancaPolimorfismo.exerciciosSecao13.exercicio1.entities.Employee;
import secao13HerancaPolimorfismo.exerciciosSecao13.exercicio1.entities.OutsourcedEmployee;

// Classe principal do programa
public class Program {

  // Método main: ponto de entrada da aplicação
  public static void main(String[] args) {

    // Define o padrão de localização como US
    // Garante que números decimais usem ponto (.) e não vírgula
    Locale.setDefault(Locale.US);

    // Scanner para leitura de dados do teclado
    Scanner sc = new Scanner(System.in);

    // Lista de funcionários
    // Usamos List<Employee> para permitir armazenar
    // tanto Employee quanto OutsourcedEmployee (polimorfismo)
    List<Employee> list = new ArrayList<>();

    // Solicita a quantidade de funcionários
    System.out.print("Enter the number of employees: ");
    int n = sc.nextInt();

    // Laço para leitura dos dados de cada funcionário
    for (int i = 1; i <= n; i++) {

      System.out.println("Employee #" + i + " data:");

      // Pergunta se o funcionário é terceirizado
      System.out.print("Outsourced (y/n)? ");
      char ch = sc.next().charAt(0);

      // Consome a quebra de linha deixada pelo next()
      // Evita pular a leitura do nome
      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();

      // Leitura das horas trabalhadas
      System.out.print("Hours: ");
      int hours = sc.nextInt();

      // Leitura do valor recebido por hora
      System.out.print("Value per hour: ");
      double valuePerHour = sc.nextDouble();

      // Verifica se é terceirizado
      if (ch == 'y') {

        // Leitura do valor adicional
        System.out.print("Additional charge: ");
        double additionalCharge = sc.nextDouble();

        // Cria um OutsourcedEmployee e adiciona à lista
        // Note que a lista é de Employee → polimorfismo
        list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));

      } else {

        // Cria um Employee comum e adiciona à lista
        list.add(new Employee(name, hours, valuePerHour));
      }
    }

    System.out.println();
    System.out.println("PAYMENTS:");

    // Percorre a lista de funcionários
    for (Employee emp : list) {

      // Chamada polimórfica do método payment()
      // O Java decide em tempo de execução
      // qual método será executado (Employee ou OutsourcedEmployee)
      System.out.println(
          emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
    }

    // Fecha o Scanner para liberar recursos
    sc.close();
  }
}
