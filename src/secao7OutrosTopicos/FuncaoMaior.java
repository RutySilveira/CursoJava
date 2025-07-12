// Define o pacote onde essa classe está localizada
package secao7OutrosTopicos;

// Importa a classe Scanner, que permite ler dados digitados pelo usuário
import java.util.Scanner;

// Declaração da classe principal
public class FuncaoMaior {
  // Método principal que inicia a execução do programa
  public static void main(String[] args) {

    // Cria um objeto Scanner para capturar a entrada do usuário
    Scanner sc = new Scanner(System.in);

    // Exibe uma mensagem pedindo ao usuário que digite três números
    System.out.println("Enter three numbers:");

    // Lê três números inteiros do teclado
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    // Chama a função max para descobrir o maior entre os três números
    int higher = max(a, b, c);

    // Chama a função showResult para exibir o resultado
    showResult(higher);

    // Fecha o scanner (boa prática para liberar o recurso)
    sc.close();
  }

  // Função que retorna o maior valor entre três inteiros
  public static int max(int x, int y, int z) {
    int aux; // Variável auxiliar para armazenar o maior valor

    // Verifica se x é o maior de todos
    if (x > y && x > z) {
      aux = x;
    }
    // Se não, verifica se y é maior que z
    else if (y > z) {
      aux = y;
    }
    // Caso contrário, z é o maior
    else {
      aux = z;
    }

    // Retorna o maior valor encontrado
    return aux;
  }

  // Função que exibe o valor passado como argumento
  public static void showResult(int value) {
    System.out.println("Higher = " + value);
  }
}
