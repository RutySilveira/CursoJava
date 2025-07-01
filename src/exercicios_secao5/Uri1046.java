/* 
Leia a hora inicial e a hora final de um jogo. 
A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. 
*/

package exercicios_secao5; // Declara o pacote onde o arquivo está salvo

import java.util.Scanner; // Importa a classe Scanner para ler entradas do teclado

public class Uri1046 {

  public static void main(String[] args) {
    // Cria o objeto Scanner para capturar a entrada do usuário
    Scanner sc = new Scanner(System.in);

    // Declara as variáveis para armazenar a hora inicial, final e a duração do jogo
    int horaInicial, horaFinal, duracao;

    // Lê os valores inteiros de hora inicial e hora final
    horaInicial = sc.nextInt();
    horaFinal = sc.nextInt();

    // Caso 1: o jogo termina no mesmo dia (hora final maior que a inicial)
    if (horaInicial < horaFinal) {
      duracao = horaFinal - horaInicial;
    }
    // Caso 2: o jogo termina no dia seguinte ou dura 24 horas (hora final menor ou
    // igual à inicial)
    else {
      duracao = 24 - horaInicial + horaFinal;
    }

    // Exibe a duração do jogo formatada conforme o enunciado
    System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);

    // Fecha o Scanner para liberar o recurso
    sc.close();
  }
}
