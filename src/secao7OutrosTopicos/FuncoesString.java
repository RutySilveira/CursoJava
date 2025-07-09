// Define o pacote onde o código está localizado. Nome do pacote segue camelCase.
package secao7OutrosTopicos;

// Declaração da classe, cujo nome segue a convenção PascalCase (inicial maiúscula em cada palavra)
public class FuncoesString {

  // Método principal da aplicação, onde a execução começa. Nome "main" está em
  // camelCase.
  public static void main(String[] args) {

    // Declara e inicializa a String original
    String original = "abcde FGHIJ ABC abc DEFG ";

    // Transforma todos os caracteres da string em minúsculas
    String s01 = original.toLowerCase();

    // Transforma todos os caracteres da string em maiúsculas
    String s02 = original.toUpperCase();

    // Remove os espaços em branco no início e no fim da string
    String s03 = original.trim();

    // Retorna a substring da posição 2 até o final (começa a contar do zero)
    String s04 = original.substring(2);

    // Retorna a substring da posição 2 até antes da posição 9
    String s05 = original.substring(2, 9);

    // Substitui todas as ocorrências do caractere 'a' por 'x'
    String s06 = original.replace('a', 'x');

    // Substitui todas as ocorrências da sequência "abc" pela string "xy"
    String s07 = original.replace("abc", "xy");

    // Retorna o índice da primeira ocorrência da sequência "bc"
    int i = original.indexOf("bc");

    // Retorna o índice da última ocorrência da sequência "bc"
    int j = original.lastIndexOf("bc");

    // Impressões dos resultados no console
    System.out.println("Original: -" + original + "-");
    System.out.println("toLowerCase: -" + s01 + "-");
    System.out.println("toUpperCase: -" + s02 + "-");
    System.out.println("trim: -" + s03 + "-");
    System.out.println("substring(2): -" + s04 + "-");
    System.out.println("substring(2, 9): -" + s05 + "-");
    System.out.println("replace('a', 'x'): -" + s06 + "-");
    System.out.println("replace('abc', 'xy'): -" + s07 + "-");
    System.out.println("Index of 'bc': " + i);
    System.out.println("Last index of 'bc': " + j);
  }
}
