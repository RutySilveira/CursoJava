package secao13HerancaPolimorfismo.metodosAbstratos.entities;

// Importa o enum Color, utilizado para definir a cor do círculo
import secao13HerancaPolimorfismo.metodosAbstratos.entities.enums.Color;

// Classe Circle
// É uma classe concreta que HERDA da classe abstrata Shape
// Por isso, ela é obrigada a implementar o método abstrato area()
public class Circle extends Shape {

  // Atributo privado que representa o raio do círculo
  // Double é usado para manter o padrão do curso e permitir null, se necessário
  private Double radius;

  // Construtor padrão
  // Chama o construtor padrão da superclasse (Shape)
  // Muito usado por frameworks ou quando o objeto é criado sem valores iniciais
  public Circle() {
    super();
  }

  // Construtor com parâmetros
  // Recebe a cor (atributo herdado de Shape) e o raio do círculo
  // super(color) chama o construtor da classe Shape responsável por definir a cor
  public Circle(Color color, Double radius) {
    super(color);
    this.radius = radius;
  }

  // Getter do raio
  // Retorna o valor do atributo radius
  public Double getRadius() {
    return radius;
  }

  // Setter do raio
  // Permite alterar o valor do raio após a criação do objeto
  public void setRadius(Double radius) {
    this.radius = radius;
  }

  // Implementação obrigatória do método abstrato area()
  // Esse método foi declarado na classe Shape
  // Cada forma geométrica calcula sua área de maneira diferente
  // Fórmula da área do círculo: π * raio²
  @Override
  public double area() {
    return Math.PI * radius * radius;
  }
}
