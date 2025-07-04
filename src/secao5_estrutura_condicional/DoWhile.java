package secao5_estrutura_condicional;

// Importando a classe Scanner para entrada de dados e Locale para definir o padrão local
import java.util.Scanner;
import java.util.Locale;

public class DoWhile {

  public static void main(String[] args) {
    // Configura a localidade para os Estados Unidos para garantir que números
    // decimais usem ponto (.) como separador
    Locale.setDefault(Locale.US);
    // Instancia um objeto Scanner para capturar a entrada do usuário a partir do
    // console
    Scanner sc = new Scanner(System.in);

    // Declara uma variável para armazenar a resposta do usuário para continuar ou
    // parar
    char resp;

    // Inicia uma estrutura de repetição do-while que continua até que a resposta
    // seja 'n'
    do {
      // Solicita que o usuário insira a temperatura em Celsius
      System.out.print("Digite a temperatura em Celsius: ");
      // Lê a entrada do usuário e armazena em uma variável do tipo double
      double C = sc.nextDouble();
      // Converte a temperatura de Celsius para Fahrenheit
      double F = 9.0 * C / 5.0 + 32.0;
      // Exibe a temperatura equivalente em Fahrenheit, formatada para uma casa
      // decimal
      System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
      // Pergunta ao usuário se ele deseja repetir o processo e lê a primeira letra da
      // resposta
      System.out.print("Deseja repetir (s/n)? ");
      resp = sc.next().charAt(0);
      // Repete enquanto a resposta não for 'n'
    } while (resp != 'n');

    // Fecha o Scanner para liberar os recursos
    sc.close();
  }
}
