package secao5EstruturaCondicional;

import java.util.Scanner;
import java.util.Locale;

public class AtribuicaoCumulativa {

  public static void main(String[] args) {
    // Configurando o local padrão para o formato de números com ponto decimal (no
    // padrão americano)
    Locale.setDefault(Locale.US);

    // Criando um objeto Scanner para receber entrada do usuário a partir do console
    Scanner sc = new Scanner(System.in);

    // Solicitando e lendo a quantidade de minutos utilizados
    int minutos = sc.nextInt();

    // Definindo o valor base da conta como R$ 50.0
    double conta = 50.0;

    // Verificando se a quantidade de minutos utilizados é maior que 100
    if (minutos > 100) {
      // Se a quantidade de minutos utilizados for maior que 100, calcula o valor
      // adicional da conta
      conta += (minutos - 100) * 2.0; // O valor adicional é calculado multiplicando a diferença entre os minutos
                                      // utilizados e 100 pelo valor adicional por minuto (R$ 2.0)
    }
    // Imprimindo o valor final da conta formatado com duas casas decimais
    System.out.printf("Valor da conta = R$ %.2f%n", conta);

    // Fechando o Scanner para liberar recursos
    sc.close();
  }
}
