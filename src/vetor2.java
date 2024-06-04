import java.util.Scanner; // Importa a classe Scanner do pacote java.util para entrada de dados do usuário.
import java.util.Locale; // Importa a classe Locale do pacote java.util para configurar o local padrão para formatação de números.

public class Vetor2 { // Declaração da classe vetor2.

  public static void main(String[] args) { // Método principal onde o programa começa sua execução.

    Locale.setDefault(Locale.US); // Configura o local padrão para formatação de números como US (ponto como
                                  // separador decimal).
    Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do usuário.

    int n = sc.nextInt(); // Lê um inteiro fornecido pelo usuário, que indica o tamanho do vetor.

    double[] vet = new double[n]; // Cria um vetor de doubles com o tamanho especificado pelo usuário.
    double soma = 0.0; // Inicializa a variável 'soma' que será utilizada para calcular a soma dos
                       // elementos do vetor.

    for (int i = 0; i < n; i++) { // Loop para preencher o vetor com valores fornecidos pelo usuário.
      vet[i] = sc.nextDouble(); // Lê um double fornecido pelo usuário e o armazena na posição 'i' do vetor.
    }

    for (int i = 0; i < n; i++) { // Loop para imprimir os elementos do vetor.
      System.out.print(vet[i] + " "); // Imprime o elemento na posição 'i' do vetor seguido de um espaço.
    }
    System.out.println(); // Imprime uma nova linha após imprimir todos os elementos do vetor.

    for (int i = 0; i < n; i++) { // Loop para calcular a soma dos elementos do vetor.
      soma += vet[i]; // Adiciona o elemento na posição 'i' do vetor à variável 'soma'.
    }

    double media = soma / n; // Calcula a média dos elementos do vetor.
    System.out.printf("%.2f%n", soma); // Imprime a soma dos elementos do vetor formatada com duas casas decimais.
    System.out.printf("%.2f%n", media); // Imprime a média dos elementos do vetor formatada com duas casas decimais.

    sc.close(); // Fecha o objeto Scanner para liberar recursos.
  }
}
