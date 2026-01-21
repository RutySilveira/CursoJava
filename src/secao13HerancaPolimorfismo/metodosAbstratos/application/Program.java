package secao13HerancaPolimorfismo.metodosAbstratos.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao13HerancaPolimorfismo.metodosAbstratos.entities.Shape;
import secao13HerancaPolimorfismo.metodosAbstratos.entities.Circle;
import secao13HerancaPolimorfismo.metodosAbstratos.entities.Rectangle;
import secao13HerancaPolimorfismo.metodosAbstratos.entities.enums.Color;

public class Program {

  public static void main(String[] args) {

    // Define o padrão de localização como US
    // Isso garante que o separador decimal seja "." ao invés de ","
    Locale.setDefault(Locale.US);

    // Scanner para entrada de dados pelo teclado
    Scanner sc = new Scanner(System.in);

    /*
     * Lista do tipo Shape (classe abstrata).
     * 
     * Isso é MUITO importante:
     * - Trabalhamos com o tipo mais genérico possível
     * - A lista pode armazenar qualquer objeto que herde de Shape
     * (Circle, Rectangle ou futuras formas)
     * 
     * Esse é um exemplo clássico de POLIMORFISMO.
     */
    List<Shape> list = new ArrayList<>();

    // Pergunta ao usuário quantas formas ele deseja cadastrar
    System.out.print("Enter the number of shapes: ");
    int n = sc.nextInt();

    /*
     * Loop para cadastrar cada forma.
     * Começa em 1 apenas para exibição mais amigável ao usuário.
     */
    for (int i = 1; i <= n; i++) {

      System.out.println("Shape #" + i + " data:");

      // Pergunta se a forma será um Retângulo ou um Círculo
      System.out.print("Rectangle or Circle (r/c)? ");
      char ch = sc.next().charAt(0);

      /*
       * Lê a cor digitada pelo usuário.
       * Color.valueOf converte a String em um valor do enum Color.
       * 
       * Exemplo:
       * "BLACK" → Color.BLACK
       * 
       * OBS: o texto deve ser exatamente igual ao enum.
       */
      System.out.print("Color (BLACK/BLUE/RED): ");
      Color color = Color.valueOf(sc.next());

      /*
       * Estrutura condicional:
       * - Se for 'r', cria um Rectangle
       * - Caso contrário, cria um Circle
       */
      if (ch == 'r') {

        // Leitura dos dados específicos do Retângulo
        System.out.print("Width: ");
        double width = sc.nextDouble();

        System.out.print("Height: ");
        double height = sc.nextDouble();

        /*
         * Cria um objeto Rectangle e adiciona na lista.
         * Mesmo sendo Rectangle, ele é tratado como Shape.
         */
        list.add(new Rectangle(color, width, height));

      } else {

        // Leitura do dado específico do Círculo
        System.out.print("Radius: ");
        double radius = sc.nextDouble();

        /*
         * Cria um objeto Circle e adiciona na lista.
         * Novamente, ocorre polimorfismo.
         */
        list.add(new Circle(color, radius));
      }
    }

    System.out.println();
    System.out.println("SHAPE AREAS:");

    /*
     * Percorre a lista de formas.
     * 
     * Aqui acontece o POLIMORFISMO DE MÉTODOS:
     * - shape.area() chama:
     * - area() do Rectangle se for um retângulo
     * - area() do Circle se for um círculo
     * 
     * O Java decide em tempo de execução qual método usar.
     */
    for (Shape shape : list) {
      System.out.println(String.format("%.2f", shape.area()));
    }

    // Fecha o Scanner (boa prática)
    sc.close();
  }
}
