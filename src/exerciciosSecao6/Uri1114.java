/* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002. */

package exerciciosSecao6; // Declara o pacote onde o arquivo Java está localizado

import java.util.Scanner; // Importa a classe Scanner para permitir leitura de dados do teclado

public class Uri1114 { // Declaração da classe pública chamada Uri1114 (poderia ser outro nome,
                       // relacionado ao exercício)

  public static void main(String[] args) { // Método principal: é o ponto de partida do programa

    Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para receber entradas do usuário

    int condicao = 2002; // Define a senha correta que permitirá o acesso
    int senha; // Declara uma variável para armazenar a senha digitada pelo usuário

    senha = sc.nextInt(); // Lê a primeira tentativa de senha

    while (senha != condicao) { // Enquanto a senha for diferente da correta (2002)
      System.out.println("Senha Invalida"); // Informa que a senha está incorreta
      senha = sc.nextInt(); // Lê uma nova tentativa de senha
    }

    System.out.println("Acesso Permitido"); // Quando a senha correta for digitada, imprime essa mensagem

    sc.close(); // Fecha o Scanner para liberar o recurso de entrada de dados

  }
}
