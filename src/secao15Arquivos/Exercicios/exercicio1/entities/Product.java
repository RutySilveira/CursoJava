package secao15Arquivos.Exercicios.exercicio1.entities;

// Classe que representa um produto do sistema
public class Product {

  // Nome do produto
  private String name;

  // Preço unitário do produto
  private Double price;

  // Quantidade disponível ou comprada do produto
  private Integer quantity;

  // Construtor da classe Product
  // Inicializa o objeto com nome, preço e quantidade
  public Product(String name, Double price, Integer quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  // Retorna o nome do produto
  public String getName() {
    return name;
  }

  // Altera o nome do produto
  public void setName(String name) {
    this.name = name;
  }

  // Retorna o preço do produto
  public Double getPrice() {
    return price;
  }

  // Altera o preço do produto
  public void setPrice(Double price) {
    this.price = price;
  }

  // Retorna a quantidade do produto
  public Integer getQuantity() {
    return quantity;
  }

  // Altera a quantidade do produto
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  // Calcula o valor total do produto
  // (preço unitário * quantidade)
  public double total() {
    return price * quantity;
  }
}
