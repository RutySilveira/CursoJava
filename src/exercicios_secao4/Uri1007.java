/* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */

// Define o pacote onde essa classe está localizada, ajudando na organização do projeto
package exercicios_secao4;

// Importa a classe Scanner da biblioteca java.util para permitir a leitura de dados do teclado
import java.util.Scanner;

// Declaração da classe pública Ex3_diferenca
public class Uri1007 {

  // Método principal: ponto de entrada da aplicação Java
  public static void main(String[] args) {

    // Cria um objeto Scanner para ler entradas do usuário via teclado
    Scanner sc = new Scanner(System.in);

    // Declaração de variáveis inteiras a, b, c, d e diferenca
    int a, b, c, d, diferenca;

    // Lê quatro valores inteiros digitados pelo usuário e armazena nas variáveis
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();

    // Calcula a diferença entre o produto de a e b com o produto de c e d
    diferenca = (a * b - c * d);

    // Exibe o resultado no console com concatenação de string
    System.out.println("DIFERENCA = " + diferenca);

    // Fecha o objeto Scanner para liberar recursos do sistema
    sc.close();
  }
}
