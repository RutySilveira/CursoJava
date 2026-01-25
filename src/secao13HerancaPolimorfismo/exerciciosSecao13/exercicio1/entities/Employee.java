package secao13HerancaPolimorfismo.exerciciosSecao13.exercicio1.entities;

// Classe base Employee
// Ela representa um funcionário "comum" e será usada como superclasse
// para outras classes, como OutsourcedEmployee
public class Employee {

  // Nome do funcionário
  // private: só pode ser acessado diretamente dentro da própria classe
  private String name;

  // Quantidade de horas trabalhadas
  // Usamos Integer (wrapper) para permitir null, se necessário
  private Integer hours;

  // Valor recebido por hora trabalhada
  // Double permite operações com casas decimais
  private Double valuePerHour;

  // Construtor padrão
  // Necessário para alguns frameworks e também útil quando
  // queremos criar o objeto sem passar dados imediatamente
  public Employee() {
  }

  // Construtor com parâmetros
  // Usado para criar um funcionário já com todos os dados definidos
  public Employee(String name, Integer hours, Double valuePerHour) {
    // 'this' diferencia o atributo da classe do parâmetro recebido
    this.name = name;
    this.hours = hours;
    this.valuePerHour = valuePerHour;
  }

  // Retorna o nome do funcionário
  public String getName() {
    return name;
  }

  // Permite alterar o nome do funcionário
  public void setName(String name) {
    this.name = name;
  }

  // Retorna a quantidade de horas trabalhadas
  public Integer getHours() {
    return hours;
  }

  // Permite alterar as horas trabalhadas
  public void setHours(Integer hours) {
    this.hours = hours;
  }

  // Retorna o valor recebido por hora
  public Double getValuePerHour() {
    return valuePerHour;
  }

  // Permite alterar o valor recebido por hora
  public void setValuePerHour(Double valuePerHour) {
    this.valuePerHour = valuePerHour;
  }

  // Método responsável por calcular o pagamento do funcionário
  // Para um Employee comum, o pagamento é:
  // horas trabalhadas * valor por hora
  // Esse método será sobrescrito (override) nas subclasses,
  // permitindo o uso de polimorfismo
  public double payment() {
    return hours * valuePerHour;
  }
}
