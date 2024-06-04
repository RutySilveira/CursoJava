import java.util.Scanner; // Importa a classe Scanner do pacote java.util para entrada de dados do usuário.
import java.util.Locale; // Importa a classe Locale do pacote java.util para configurar o local padrão para formatação de números.

public class Vetor3 { // Declaração da classe vetor3.

  public static void main(String[] args) { // Método principal onde o programa começa sua execução.

    Locale.setDefault(Locale.US); // Configura o local padrão para formatação de números como US (ponto como
                                  // separador decimal).
    Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do usuário.

    int n = sc.nextInt(); // Lê um inteiro fornecido pelo usuário, que indica o número de pessoas.
    String[] vet_nome = new String[n]; // Cria um array de strings para armazenar os nomes das pessoas.
    int[] vet_idade = new int[n]; // Cria um array de inteiros para armazenar as idades das pessoas.
    double[] vet_altura = new double[n]; // Cria um array de doubles para armazenar as alturas das pessoas.
    int cont_idades = 0; // Inicializa a variável para contar o número de pessoas com menos de 16 anos.
    double soma_altura = 0.0; // Inicializa a variável para calcular a soma das alturas das pessoas.

    // Loop para ler os dados de cada pessoa e armazená-los nos arrays
    // correspondentes.
    for (int i = 0; i < n; i++) {
      vet_nome[i] = sc.next(); // Lê o nome da pessoa.
      vet_idade[i] = sc.nextInt(); // Lê a idade da pessoa.
      vet_altura[i] = sc.nextDouble(); // Lê a altura da pessoa.
    }

    // Loop para calcular a soma das alturas e contar o número de pessoas com menos
    // de 16 anos.
    for (int i = 0; i < n; i++) {
      soma_altura += vet_altura[i]; // Adiciona a altura da pessoa atual à soma das alturas.
      if (vet_idade[i] < 16) { // Verifica se a pessoa atual tem menos de 16 anos.
        cont_idades += 1; // Incrementa o contador de pessoas com menos de 16 anos.
      }
    }

    double media_altura = soma_altura / n; // Calcula a média das alturas das pessoas.
    double idade_menor16 = cont_idades * 100.0 / n; // Calcula a porcentagem de pessoas com menos de 16 anos.

    // Imprime a média das alturas das pessoas e a porcentagem de pessoas com menos
    // de 16 anos.
    System.out.printf("Altura média: %.2f%n", media_altura); // Formata e imprime a média das alturas com duas casas
    // decimais.
    System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", idade_menor16); // Formata e imprime a porcentagem com
    // uma casa decimal seguida do símbolo
    // de porcentagem

    sc.close(); // Fecha o objeto Scanner para liberar recursos.
  }
}
