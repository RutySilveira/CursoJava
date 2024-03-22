// Define uma classe chamada Concatenacao
public class concatenacao {

  // Método main, que é o ponto de entrada para qualquer aplicativo Java
  public static void main(String[]args){

    // Declara uma variável do tipo String chamada 'nome' e atribui a ela o valor "Maria"
    String nome = "Maria";
    
    // Declara uma variável do tipo int chamada 'idade' e atribui a ela o valor 31
    int idade = 31;
    
    // Declara uma variável do tipo double chamada 'renda' e atribui a ela o valor 4000.0
    double renda = 4000.0;

    // Usa o método printf para formatar e imprimir a string no console
    // %s é um placeholder para uma string (nome), %d para um inteiro (idade) e %.2f para um número de ponto flutuante com duas casas decimais (renda)
    // %n é um placeholder para uma nova linha, independente do sistema operacional
    System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
  }
  // Fim do método main
}
// Fim da classe Concatenacao
