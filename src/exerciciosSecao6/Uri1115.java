/* 
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma). 
*/

package exerciciosSecao6;
// Declara o pacote onde o arquivo Java está localizado

import java.util.Scanner;
// Importa a classe Scanner para permitir a leitura de dados do teclado

public class Uri1115 {
  // Declaração da classe pública chamada Uri1115, nome dado geralmente com base
  // no exercício proposto

  public static void main(String[] args) {
    // Método principal: ponto de partida da execução do programa

    Scanner sc = new Scanner(System.in);
    // Cria um objeto Scanner para ler entradas do usuário

    int x, y;
    // Declara duas variáveis inteiras para armazenar as coordenadas X e Y

    x = sc.nextInt();
    y = sc.nextInt();
    // Lê a primeira coordenada (x, y) digitada pelo usuário

    // Enquanto nenhuma das coordenadas for zero
    while (x != 0 && y != 0) {

      // Verifica em qual quadrante o ponto (x, y) se encontra e imprime o nome
      // correspondente:
      if (x > 0 && y > 0) {
        System.out.println("primeiro"); // Quadrante I
      } else if (x < 0 && y > 0) {
        System.out.println("segundo"); // Quadrante II
      } else if (x < 0 && y < 0) {
        System.out.println("terceiro"); // Quadrante III
      } else {
        System.out.println("quarto"); // Quadrante IV
      }

      // Lê as próximas coordenadas
      x = sc.nextInt();
      y = sc.nextInt();
    }

    sc.close();
    // Fecha o Scanner para liberar o recurso de entrada

  }
}
