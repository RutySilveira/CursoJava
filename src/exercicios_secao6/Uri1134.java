package exercicios_secao6; // Declara o pacote onde o arquivo Java está localizado

import java.util.Scanner; // Importa a classe Scanner para permitir a leitura de dados do teclado

public class Uri1134 { // Nome da classe baseado no número do exercício

  public static void main(String[] args) { // Método principal

    Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler entradas do usuário

    int alcool = 0; // Contador para combustível álcool
    int gasolina = 0; // Contador para gasolina
    int diesel = 0; // Contador para diesel

    int num = sc.nextInt(); // Lê o primeiro código digitado pelo usuário

    // Enquanto o código digitado for diferente de 4 (fim)
    while (num != 4) {
      if (num == 1) {
        alcool++; // Incrementa o contador de álcool
      } else if (num == 2) {
        gasolina++; // Incrementa o contador de gasolina
      } else if (num == 3) {
        diesel++; // Incrementa o contador de diesel
      }
      // Se o código for inválido (ex: 5, 9, -1), apenas ignora e continua lendo
      // Nova leitura dentro do loop
      num = sc.nextInt();
    }

    // Quando o código 4 for digitado, o loop para e imprime os resultados
    System.out.println("MUITO OBRIGADO");
    System.out.printf("Alcool: %d%n", alcool);
    System.out.printf("Gasolina: %d%n", gasolina);
    System.out.printf("Diesel: %d%n", diesel);

    sc.close(); // Fecha o Scanner

  }
}
