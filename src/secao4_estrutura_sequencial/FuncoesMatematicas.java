package secao4_estrutura_sequencial;

// Define a classe FuncoesMatematicas
public class FuncoesMatematicas {

  // Método principal que executa o programa
  public static void main(String[] args) {
    // Declara e inicializa variáveis do tipo double
    double x = 3.0;
    double y = 4.0;
    double z = -5.0;
    double A, B, C;

    // Calcula a raiz quadrada de x e y, e 25, armazenando os resultados em A, B e
    // C, respectivamente
    A = Math.sqrt(x);
    B = Math.sqrt(y);
    C = Math.sqrt(25.0);

    // Imprime as raízes quadradas calculadas
    System.out.println("Raiz quadrada de " + x + " = " + A);
    System.out.println("Raiz quadrada de " + y + " = " + B);
    System.out.println("Raiz quadrada de 25 = " + C);

    // Calcula x elevado à potência y, x ao quadrado e 5 ao quadrado, armazenando os
    // resultados em A, B e C
    A = Math.pow(x, y);
    B = Math.pow(x, 2.0);
    C = Math.pow(5.0, 2.0);

    // Imprime os resultados das operações de potência
    System.out.println(x + " elevado a " + y + " = " + A);
    System.out.println(x + " elevado ao quadrado = " + B);
    System.out.println("5 elevado ao quadrado = " + C);

    // Calcula e imprime o valor absoluto de y e z
    A = Math.abs(y);
    B = Math.abs(z);

    // Imprime os valores absolutos
    System.out.println("Valor absoluto de " + y + " = " + A);
    System.out.println("Valor absoluto de " + z + " = " + B);
  }
}
