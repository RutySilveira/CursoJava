
// Importação de classes necessárias
import java.util.Scanner;
import java.util.Locale;

// Declaração da classe chamada Vetor
public class Vetor {

  // Método principal que é o ponto de entrada do programa
  public static void main(String[] args) {

    // Define o locale padrão para US para garantir o formato correto de números
    // (ponto como separador decimal)
    Locale.setDefault(Locale.US);

    // Criação de um objeto Scanner para ler entrada do console
    Scanner sc = new Scanner(System.in);

    // Lê um número inteiro da entrada do console e armazena em 'n', que definirá o
    // tamanho do vetor
    int n = sc.nextInt();

    // Declaração de um array de doubles com tamanho 'n'
    double[] vet = new double[n];

    // Loop para ler os valores double do console e armazenar em cada posição do
    // array 'vet'
    for (int i = 0; i < n; i++) {
      vet[i] = sc.nextDouble();
    }

    // Loop para imprimir cada valor do array 'vet'
    // Os valores são formatados para terem duas casas decimais e são impressos em
    // uma nova linha cada
    for (int i = 0; i < n; i++) {
      System.out.printf("%.2f%n", vet[i]);
    }

    // Fecha o scanner para liberar os recursos que foram alocados para ele
    sc.close();
  }
}
