package secao8IntroducaoPOO.entities; // Define o pacote onde a classe está localizada

// Declaração da classe Product, que representa um produto com nome, preço e quantidade em estoque
public class Product {

  // Atributos públicos da classe (por boas práticas, geralmente são privados com
  // métodos getters/setters)
  public String name; // Nome do produto
  public double price; // Preço unitário do produto
  public int quantity; // Quantidade em estoque

  // Método que calcula o valor total no estoque (preço * quantidade)
  public double totalValueInStock() {
    return price * quantity;
  }

  // Método que adiciona uma quantidade ao estoque atual
  public void addProducts(int quantity) {
    this.quantity += quantity; // Usa 'this' para referenciar o atributo da classe, diferenciando do parâmetro
  }

  // Método que remove uma quantidade do estoque atual
  public void removeProducts(int quantity) {
    this.quantity -= quantity;
  }

  // Sobrescrita do método toString para retornar uma representação em texto do
  // objeto Product
  public String toString() {
    return name
        + ", $ "
        + String.format("%.2f", price) // Formata o preço com duas casas decimais
        + ", "
        + quantity
        + " units, Total: $ "
        + String.format("%.2f", totalValueInStock()); // Mostra o valor total formatado
  }
}
