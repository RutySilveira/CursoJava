import java.util.Locale;

public class print2 {
    public static void main(String[]args){
    
      // Definindo o locale padrão para garantir o formato de número consistente
      Locale.setDefault(Locale.US);
      
      double x = 10.35784;

      // Imprime o valor original de 'x'
      System.out.println(x);
      // Imprime 'x' com duas casas decimais
      System.out.printf("%.2f%n", x);
      // Imprime 'x' com quatro casas decimais
      System.out.printf("%.4f%n", x);
    }
}




