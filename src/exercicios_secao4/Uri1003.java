package exercicios_secao4; // Define o pacote onde a classe está localizada

import java.util.Scanner; // Importa a classe Scanner para leitura de dados pelo teclado

public class Uri1003 { // Declaração da classe principal
  public static void main(String[] args) { // Método principal: ponto de entrada do programa
    Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler dados do usuário

    int a, b, soma; // Declara três variáveis inteiras: a, b e soma

    a = sc.nextInt(); // Lê o primeiro número inteiro digitado pelo usuário e armazena em 'a'
    b = sc.nextInt(); // Lê o segundo número inteiro digitado pelo usuário e armazena em 'b'

    soma = a + b; // Calcula a soma de 'a' e 'b' e armazena na variável 'soma'

    System.out.println("SOMA = " + soma); // Imprime o resultado no formato solicitado

    sc.close(); // Fecha o objeto Scanner para liberar recursos
  }
}
