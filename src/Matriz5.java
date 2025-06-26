import java.util.Locale; // Importa a classe Locale, que ajuda a definir configurações regionais.
import java.util.Scanner; // Importa a classe Scanner, utilizada para ler a entrada do usuário.

public class Matriz5 { // Declaração da classe pública Matriz5.
  public static void main(String[] args) { // Método principal que serve como ponto de entrada do programa.

    Locale.setDefault(Locale.US); // Define o Locale padrão para US, garantindo que pontos sejam usados como
                                  // separadores decimais.
    Scanner sc = new Scanner(System.in); // Cria um novo objeto Scanner que lê a entrada do teclado.

    int M = sc.nextInt(); // Lê o primeiro inteiro da entrada do usuário e armazena em M (número de linhas
                          // da matriz).
    int N = sc.nextInt(); // Lê o segundo inteiro da entrada do usuário e armazena em N (número de colunas
                          // da matriz).
    double[][] numeros = new double[M][N]; // Declara e inicializa uma matriz de números reais com M linhas e N colunas.

    for (int i = 0; i < M; i++) { // Loop que percorre cada linha da matriz.
      for (int j = 0; j < N; j++) { // Loop aninhado que percorre cada coluna da linha atual.
        numeros[i][j] = sc.nextDouble(); // Lê um número real da entrada e armazena na posição [i][j] da matriz.
      }
    }

    double[] vet = new double[M]; // Cria um vetor de double para armazenar a soma dos elementos de cada linha da
                                  // matriz.

    for (int i = 0; i < M; i++) { // Loop que percorre cada linha da matriz.
      double soma = 0.0; // Inicializa a variável soma para acumular a soma dos elementos da linha.
      for (int j = 0; j < N; j++) { // Loop que percorre cada elemento da linha i.
        soma += numeros[i][j]; // Adiciona o valor do elemento [i][j] à variável soma.
      }
      vet[i] = soma; // Armazena a soma total da linha i no vetor vet na posição i.
    }

    for (int i = 0; i < M; i++) { // Loop que percorre o vetor de somas.
      System.out.printf("%.1f%n", vet[i]); // Imprime o valor da soma de cada linha formatado para uma casa decimal.
    }

    sc.close(); // Fecha o objeto Scanner para liberar recursos do sistema.
  }
}
