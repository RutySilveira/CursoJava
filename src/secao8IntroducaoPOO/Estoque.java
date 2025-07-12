package secao8IntroducaoPOO; // Define o pacote onde essa classe está localizada

import java.util.Locale; // Importa a classe Locale para configurar a localização (formatação de números)
import java.util.Scanner; // Importa a classe Scanner para entrada de dados do usuário
import secao8IntroducaoPOO.entities.Product; // Importa a classe Product do pacote entities

public class Estoque {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US); // Define o formato numérico para o padrão dos EUA (usa ponto ao invés de
                                  // virgula

    Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler dados do teclado

    Product product = new Product(); // Instancia um novo objeto da classe Product

    System.out.println("Enter product data: ");
    System.out.print("Name: ");
    product.name = sc.nextLine(); // Lê o nome do produto
    System.out.print("Price: ");
    product.price = sc.nextDouble(); // Lê o preço do produto
    System.out.print("Quantity in stock: ");
    product.quantity = sc.nextInt(); // Lê a quantidade em estoque

    System.out.println();
    System.out.println("Product data: " + product); // Exibe os dados do produto (usa o método toString da classe
                                                    // Product)

    System.out.println();
    System.out.println("Enter the number of products to be added in stock: ");
    int quantity = sc.nextInt(); // Lê a quantidade a ser adicionada ao estoque
    product.addProducts(quantity); // Chama o método que adiciona produtos

    System.out.println();
    System.out.println("Update data: " + product); // Exibe os dados atualizados do produto

    System.out.println();
    System.out.println("Enter the number of products to be removed from stock: ");
    quantity = sc.nextInt(); // Lê a quantidade a ser removida do estoque
    product.removeProducts(quantity); // Chama o método que remove produtos

    System.out.println();
    System.out.println("Update data: " + product); // Exibe os dados atualizados após remoção

    sc.close(); // Fecha o Scanner para liberar recursos
  }
}
