/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos. */

// Declara o pacote onde essa classe está localizada.
// Isso ajuda a organizar o projeto em seções/pacotes.
package exercicios_secao4;

// Importa a classe Scanner, que permite ler dados digitados pelo usuário.
import java.util.Scanner;

// Declaração da classe principal chamada "Soma"
public class Uri1003 {

  // Método main: ponto de entrada da aplicação Java
  public static void main(String[] args) {

    // Cria um objeto Scanner chamado 'sc' para capturar a entrada do teclado
    Scanner sc = new Scanner(System.in);

    // Declara três variáveis inteiras: a, b e soma
    int a, b, soma;

    // Lê o primeiro número digitado e armazena na variável 'a'
    a = sc.nextInt();

    // Lê o segundo número digitado e armazena na variável 'b'
    b = sc.nextInt();

    // Realiza a soma de 'a' com 'b' e armazena o resultado na variável 'soma'
    soma = a + b;

    // Exibe o resultado da soma no console
    System.out.println("SOMA = " + soma);

    // Fecha o Scanner para evitar vazamento de recursos
    sc.close();
  }

}
