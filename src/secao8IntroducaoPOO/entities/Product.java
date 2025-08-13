package secao8IntroducaoPOO.entities;
// Define o pacote onde a classe está localizada. 

// Isso organiza o código e facilita o gerenciamento de classes relacionadas.

// Declaração da classe Product, que representa um produto
// com nome, preço e quantidade em estoque.
public class Product {

  // ===== ATRIBUTOS =====
  // Estes atributos estão públicos, mas por boas práticas deveriam ser privados,
  // usando getters e setters para controlar o acesso.
  private String name; // Nome do produto
  private double price; // Preço unitário do produto
  private int quantity; // Quantidade em estoque

  // ===== CONSTRUTORES =====

  public Product() {
    // Construtor padrão (vazio) — permite criar um objeto sem definir valores
    // iniciais.
  }

  public Product(String name, double price, int quantity) {
    // Construtor que inicializa todos os atributos.
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public Product(String name, double price) {
    // Construtor que inicializa apenas nome e preço (quantidade padrão será zero).
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  // ===== MÉTODOS =====

  // Calcula o valor total no estoque (preço × quantidade).
  public double totalValueInStock() {
    return price * quantity;
  }

  // Adiciona produtos ao estoque.
  public void addProducts(int quantity) {
    // 'this.quantity' refere-se ao atributo da classe,
    // enquanto 'quantity' (sem this) é o parâmetro do método.
    this.quantity += quantity;
  }

  // Remove produtos do estoque.
  public void removeProducts(int quantity) {
    this.quantity -= quantity;
  }

  // Sobrescreve o método toString para retornar uma representação textual do
  // objeto.
  public String toString() {
    return name
        + ", $ "
        + String.format("%.2f", price) // Formata o preço com 2 casas decimais.
        + ", "
        + quantity
        + " units, Total: $ "
        + String.format("%.2f", totalValueInStock()); // Valor total formatado.
  }
}
