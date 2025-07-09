// Define o pacote onde o arquivo está localizado, seguindo a convenção camelCase (começa com minúscula)
package secao7OutrosTopicos;

// Importa a classe Scanner para leitura de entrada do usuário
import java.util.Scanner;

// Declaração da classe Programa
// Nome segue a convenção PascalCase: começa com letra maiúscula e cada nova palavra também com maiúscula
public class Programa {

  // Método principal da aplicação Java
  // Nome do método `main` segue camelCase (começa com minúscula)
  public static void main(String[] args) {

    // Criação de um objeto Scanner para ler entrada do usuário pelo console
    // Nome da variável `sc` está em camelCase
    Scanner sc = new Scanner(System.in);

    // Criação de uma máscara binária com valor 100000 (em binário), que corresponde
    // ao valor 32 (decimal)
    // Essa máscara representa o sexto bit (contando a partir do menos
    // significativo, da direita para a esquerda)
    int mask = 0b100000;

    // Lê um número inteiro digitado pelo usuário
    int n = sc.nextInt();

    // Verifica se o 6º bit do número `n` está ativado (igual a 1)
    // A operação (n & mask) faz um "E" bit a bit; se o resultado for diferente de
    // 0, o bit está ativado
    if ((n & mask) != 0) {
      System.out.println("6th bit is true!"); // Se o 6º bit for 1, imprime essa mensagem
    } else {
      System.out.println("6th bit is false"); // Se for 0, imprime essa
    }

    // Fecha o Scanner para liberar o recurso
    sc.close();
  }
}
