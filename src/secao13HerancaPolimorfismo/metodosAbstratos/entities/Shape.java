package secao13HerancaPolimorfismo.metodosAbstratos.entities;

// Importa o enum Color, que representa as possíveis cores da forma
// Esse enum geralmente define valores como BLACK, BLUE, RED, etc.
import secao13HerancaPolimorfismo.metodosAbstratos.entities.enums.Color;

// Classe abstrata Shape
// Ela representa uma forma geométrica genérica
// Por ser abstrata, NÃO pode ser instanciada diretamente
// Serve como modelo/base para outras classes (ex: Circle, Rectangle)
public abstract class Shape {

  // Atributo privado que armazena a cor da forma
  // protected ou private garante encapsulamento
  private Color color;

  // Construtor padrão (sem parâmetros)
  // Necessário para permitir que subclasses possam chamá-lo implicitamente
  public Shape() {

  }

  // Construtor com parâmetro
  // Permite criar uma forma já definindo sua cor
  public Shape(Color color) {
    this.color = color;
  }

  // Método getter
  // Retorna a cor da forma
  public Color getColor() {
    return color;
  }

  // Método setter
  // Permite alterar a cor da forma após sua criação
  public void setColor(Color color) {
    this.color = color;
  }

  // Método abstrato area()
  // NÃO possui implementação nesta classe
  // Obriga todas as subclasses concretas a implementarem esse método
  // Cada forma (círculo, retângulo, etc.) terá sua própria lógica de cálculo de
  // área
  public abstract double area();
}
