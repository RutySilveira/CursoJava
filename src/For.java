import java.util.Scanner;

public class For {

  public static void main(String[] args) {
    // Criação de um objeto Scanner para ler a entrada do usuário
    Scanner sc = new Scanner(System.in);

    // Leitura da quantidade de números que serão somados
    int n = sc.nextInt();
    // Inicialização da variável soma com zero
    int soma = 0;

    // Loop 'for' para repetir 'n' vezes
    for (int i = 0; i < n; i++) {
      // Leitura do próximo número fornecido pelo usuário
      int x = sc.nextInt();
      // Adição do número à variável soma
      soma = soma + x;
    }

    // Impressão do valor total da soma
    System.out.println(soma);

    // Fecha o objeto Scanner para evitar vazamento de recursos
    sc.close();
  }
}
