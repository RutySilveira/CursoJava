/* Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. */

// Pacote onde o arquivo está localizado
package exercicios_secao5;

// Importa a classe Locale para configurar o formato numérico (ponto em vez de vírgula)
// e a classe Scanner para entrada de dados
import java.util.Locale;
import java.util.Scanner;

// Classe principal do programa
public class Uri1037 {

  // Método principal onde o programa começa a ser executado
  public static void main(String[] args) {

    // Define o formato numérico padrão como o dos EUA (para usar ponto como
    // separador decimal)
    Locale.setDefault(Locale.US);

    // Cria um objeto Scanner para ler entrada do usuário
    Scanner sc = new Scanner(System.in);

    // Declara a variável que irá armazenar o valor digitado
    double n;

    // Lê um número real digitado pelo usuário e armazena na variável 'n'
    n = sc.nextDouble();

    // Verifica se o valor está fora do intervalo de 0 a 100
    if (n < 0.0 || n > 100.0) {
      System.out.println("Fora de intervalo");

      // Verifica se o valor está no intervalo de 0 a 25 (inclusive)
    } else if (n <= 25.0) {
      System.out.println("Intervalo [0,25]");

      // Verifica se o valor está no intervalo de 25 a 50 (exclusivo 25, inclusivo 50)
    } else if (n <= 50.0) {
      System.out.println("Intervalo (25,50]");

      // Verifica se o valor está no intervalo de 50 a 75 (exclusivo 50, inclusivo 75)
    } else if (n <= 75.0) {
      System.out.println("Intervalo (50,75]");

      // Se nenhuma das condições anteriores for verdadeira, então o valor está entre
      // 75 e 100
      // (exclusivo 75, inclusivo 100)
    } else {
      System.out.println("Intervalo (75,100]");
    }

    // Fecha o objeto Scanner (boa prática para liberar recursos)
    sc.close();

  }
}
