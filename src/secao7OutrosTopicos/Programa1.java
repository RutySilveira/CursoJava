// Define o pacote onde o arquivo está localizado. Segue a convenção camelCase (começa com letra minúscula)
package secao7OutrosTopicos;

// Declaração da classe principal com nome em PascalCase (letra maiúscula no início de cada palavra)
public class Programa1 {

  // Método principal da aplicação. Nome do método segue camelCase (inicia com
  // minúscula)
  public static void main(String[] args) {

    // Declara e inicializa duas variáveis inteiras
    int n1 = 89; // Binário: 0101 1001
    int n2 = 60; // Binário: 0011 1100

    // Realiza uma operação "E" bit a bit (AND)
    // Compara cada bit de n1 e n2, resultado só é 1 se ambos os bits forem 1
    // Resultado: 0001 1000 (decimal 24)
    System.out.println(n1 & n2);

    // Realiza uma operação "OU" bit a bit (OR)
    // Resultado tem 1 se pelo menos um dos bits for 1
    // Resultado: 0111 1101 (decimal 125)
    System.out.println(n1 | n2);

    // Realiza uma operação "OU exclusivo" bit a bit (XOR)
    // Resultado tem 1 se os bits forem diferentes
    // Resultado: 0110 0101 (decimal 101)
    System.out.println(n1 ^ n2);
  }
}
