import java.util.Scanner; // Importa a classe Scanner do pacote java.util para entrada de dados do usuário.
import java.util.Locale; // Importa a classe Locale do pacote java.util para configurar o local padrão para formatação de números.

public class Vetor4 { // Declaração da classe Vetor4.

  public static void main(String[] args) { // Método principal onde o programa começa sua execução.

    Locale.setDefault(Locale.US); // Configura o local padrão para formatação de números como US (ponto como
                                  // separador decimal).
    Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do usuário.

    int n = sc.nextInt(); // Lê um inteiro fornecido pelo usuário, que indica o tamanho do vetor.
    double maior = 0.0; // Inicializa a variável para armazenar o maior número real lido.
    int posicao = 0; // Inicializa a variável para armazenar a posição do maior número real no vetor.

    Double[] vet_numerosreais = new Double[n]; // Cria um array de objetos Double para armazenar os números reais
    // fornecidos pelo usuário.

    // Loop para ler os números reais fornecidos pelo usuário e armazená-los no
    // array.
    for (int i = 0; i < n; i++) {
      vet_numerosreais[i] = sc.nextDouble(); // Lê o próximo número real fornecido pelo usuário e o armazena no array.
    }

    // Loop para encontrar o maior número real no array e determinar sua posição.
    for (int i = 0; i < n; i++) {
      if (vet_numerosreais[i] > maior) { // Verifica se o número real na posição 'i' é maior que o atual maior.
        maior = vet_numerosreais[i]; // Se sim, atualiza o valor de 'maior'.
        posicao = i; // Atualiza a posição do maior número.
      }
    }

    System.out.println(maior); // Imprime o maior número real encontrado.
    System.out.println(posicao); // Imprime a posição do maior número real.

    sc.close(); // Fecha o objeto Scanner para liberar recursos.

  }
}
