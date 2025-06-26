import java.util.Scanner; // Importa a classe Scanner do pacote java.util para entrada de dados do usuário.

public class Vetor1 { // Declaração da classe vetor1.

  public static void main(String[] args) { // Método principal onde o programa começa sua execução.

    Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do usuário.

    int n = sc.nextInt(); // Lê um inteiro fornecido pelo usuário, que indica o tamanho do vetor.

    int[] vet = new int[n]; // Cria um vetor de inteiros com o tamanho especificado pelo usuário.

    for (int i = 0; i < n; i++) { // Loop para preencher o vetor com valores fornecidos pelo usuário.
      vet[i] = sc.nextInt(); // Lê um inteiro fornecido pelo usuário e o armazena na posição 'i' do vetor.
    }

    for (int i = 0; i < n; i++) { // Loop para percorrer o vetor e imprimir os valores negativos.
      if (vet[i] < 0) // Verifica se o valor na posição 'i' do vetor é negativo.
        System.out.println(vet[i]); // Se for negativo, imprime o valor.
    }

    sc.close(); // Fecha o objeto Scanner para liberar recursos.
  }
}
