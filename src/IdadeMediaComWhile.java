import java.util.Locale;
import java.util.Scanner;

public class IdadeMediaComWhile {
  public static void main(String[] args) {
    // Configura a localização padrão para os Estados Unidos, garantindo que a
    // formatação dos números decimais utilize o ponto como separador
    Locale.setDefault(Locale.US);
    // Criação de um objeto Scanner para ler a entrada do usuário
    Scanner sc = new Scanner(System.in);

    // Leitura inicial da idade fornecida pelo usuário
    int idade = sc.nextInt();
    // Inicializa a variável soma para acumular a soma das idades
    int soma = 0;
    // Inicializa a variável cont para contar quantas idades foram fornecidas
    int cont = 0;

    // Enquanto a idade for maior ou igual a 0, o loop continua
    while (idade >= 0) {
      // Adiciona a idade à variável soma
      soma = soma + idade;
      // Incrementa o contador de idades fornecidas
      cont = cont + 1;
      // Lê a próxima idade fornecida pelo usuário
      idade = sc.nextInt();
    }

    // Verifica se pelo menos uma idade válida foi fornecida
    if (cont > 0) {
      // Calcula a média convertendo a soma para double para garantir precisão na
      // divisão
      double media = (double) soma / cont;
      // Imprime a média das idades com duas casas decimais
      System.out.printf("%.2f%n", media);
    } else {
      // Caso nenhuma idade válida tenha sido fornecida, imprime mensagem de erro
      System.out.println("impossivel calcular");
    }

    // Fecha o objeto Scanner para evitar vazamento de recursos
    sc.close();
  }
}
