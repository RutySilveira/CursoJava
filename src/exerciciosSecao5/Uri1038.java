package exerciciosSecao5; // Declara o pacote onde o arquivo está localizado

import java.util.Locale; // Importa a classe Locale para configurar o formato numérico
import java.util.Scanner; // Importa a classe Scanner para leitura de dados do teclado

public class Uri1038 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in); // Cria o objeto Scanner para ler entrada do usuário
    Locale.setDefault(Locale.US); // Define o formato numérico para usar ponto decimal (padrão dos EUA)

    int cod = sc.nextInt(); // Lê o código do item (1 a 5)
    int qtd = sc.nextInt(); // Lê a quantidade do item comprado

    double total; // Variável que armazenará o valor total da compra

    // Usa estrutura switch para escolher o valor unitário com base no código
    switch (cod) {
      case 1:
        total = qtd * 4.00; // Cachorro Quente
        break;
      case 2:
        total = qtd * 4.50; // X-Salada
        break;
      case 3:
        total = qtd * 5.00; // X-Bacon
        break;
      case 4:
        total = qtd * 2.00; // Torrada Simples
        break;
      case 5:
        total = qtd * 1.50; // Refrigerante
        break;
      default:
        // Se o código for inválido (fora do intervalo de 1 a 5), o programa encerra sem
        // calcular
        sc.close();
        return; // Sai do programa sem imprimir nada
    }

    // Imprime o valor total formatado com duas casas decimais
    System.out.printf("Total: R$ %.2f%n", total);

    sc.close(); // Fecha o Scanner para liberar o recurso
  }
}
