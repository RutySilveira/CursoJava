package secao13HerancaPolimorfismo.metodosAbstratos.entities;

// Importa o enum Color, usado para definir a cor do retângulo
import secao13HerancaPolimorfismo.metodosAbstratos.entities.enums.Color;

// Classe Rectangle
// É uma classe concreta que HERDA da classe abstrata Shape
// Por isso, ela é obrigada a implementar o método abstrato area()
public class Rectangle extends Shape {

  // Atributos privados que representam as dimensões do retângulo
  // Double é usado (em vez de double) por padrão do curso e possibilidade de null
  private Double width;
  private Double height;

  // Construtor padrão
  // Chama o construtor padrão da superclasse (Shape)
  // Útil para frameworks ou criação do objeto sem dados iniciais
  public Rectangle() {
    super();
  }

  // Construtor com parâmetros
  // Recebe a cor (da classe Shape) e as dimensões do retângulo
  // super(color) chama o construtor da classe Shape que define a cor
  public Rectangle(Color color, Double width, Double height) {
    super(color);
    this.width = width;
    this.height = height;
  }

  // Getter da largura
  // Retorna o valor do atributo width
  public Double getWidth() {
    return width;
  }

  // Setter da largura
  // Permite alterar a largura do retângulo
  public void setWidth(Double width) {
    this.width = width;
  }

  // Getter da altura
  // Retorna o valor do atributo height
  public Double getHeight() {
    return height;
  }

  // Setter da altura
  // Permite alterar a altura do retângulo
  public void setHeight(Double height) {
    this.height = height;
  }

  // Implementação obrigatória do método abstrato area()
  // Esse método vem da classe Shape
  // Cada forma geométrica calcula a área de forma diferente
  // Para o retângulo: área = largura * altura
  @Override
  public double area() {
    return width * height;
  }
}
