package secao4_estrutura_sequencial;

// Importa a classe Locale do pacote java.util para manipulação de configurações regionais
import java.util.Locale;

// Define a classe principal do programa
public class Concatenacao1 {

  // Método main, ponto de entrada do programa
  public static void main(String[] args) {

    // Declara e inicializa variáveis de string com nomes de produtos
    String product1 = "Computer";
    String product2 = "Office desk";

    // Declara e inicializa uma variável byte com a idade
    byte age = 30;

    // Declara e inicializa uma variável int com o código
    int code = 5290;

    // Declara e inicializa uma variável char com o gênero
    char gender = 'F';

    // Declara e inicializa variáveis double com os preços dos produtos
    double price1 = 2100.0;
    double price2 = 650.50;

    // Declara e inicializa uma variável double com uma medida
    double measure = 53.234567;

    // Imprime uma linha de cabeçalho para a seção de produtos
    System.out.println("Products:");

    // Imprime os nomes e preços dos produtos formatados com 2 casas decimais
    System.out.printf("%s, which price is $ %.2f%n", product1, price1);
    System.out.printf("%s, which price is $ %.2f%n", product2, price2);

    // Insere uma linha em branco para separar as seções
    System.out.println();

    // Imprime os detalhes do registro (idade, código e gênero) formatados
    System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);

    // Insere outra linha em branco para separar as seções
    System.out.println();

    // Imprime a medida com oito casas decimais
    System.out.printf("Measue with eight decimal places: %.8f%n", measure);

    // Imprime a medida arredondada para três casas decimais
    System.out.printf("Rouded (three decimal places): %.3f%n", measure);

    // Define o padrão de localização para os Estados Unidos (afeta a formatação de
    // números)
    Locale.setDefault(Locale.US);

    // Imprime a medida com três casas decimais usando o padrão de ponto decimal dos
    // EUA
    System.out.printf("US decimal point: %.3f%n", measure);
  }
  // Fim do método main
}
// Fim da classe Main
