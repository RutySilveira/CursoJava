// Define o pacote onde está a classe. O nome do pacote segue a convenção camelCase (inicia com letra minúscula).
package secao7OutrosTopicos;

// Declaração da classe Split. O nome segue a convenção PascalCase (primeira letra de cada palavra em maiúscula).
public class Split {

  // Método principal da aplicação, onde o programa começa. Nome do método segue
  // camelCase.
  public static void main(String[] args) {

    // Declara uma string com três palavras separadas por espaços
    String s = "potato apple lemon";

    // Usa o método split para dividir a string em partes, separando onde houver
    // espaço (" ")
    // O resultado é um vetor (array) de strings: ["potato", "apple", "lemon"]
    String[] vect = s.split(" ");

    // Imprime o primeiro elemento do vetor (palavra "potato")
    System.out.println(vect[0]);

    // Imprime o segundo elemento do vetor (palavra "apple")
    System.out.println(vect[1]);

    // Imprime o terceiro elemento do vetor (palavra "lemon")
    System.out.println(vect[2]);
  }

}
