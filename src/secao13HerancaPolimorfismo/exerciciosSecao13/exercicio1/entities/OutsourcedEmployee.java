package secao13HerancaPolimorfismo.exerciciosSecao13.exercicio1.entities;

// Classe OutsourcedEmployee
// Representa um funcionário terceirizado
// Ela HERDA atributos e métodos da classe Employee
public class OutsourcedEmployee extends Employee {

  // Taxa adicional paga ao funcionário terceirizado
  // Esse valor será acrescido ao pagamento base
  private Double additionalCharge;

  // Construtor padrão
  // Chama o construtor padrão da superclasse (Employee)
  // Útil quando o objeto será criado sem dados iniciais
  public OutsourcedEmployee() {
    super();
  }

  // Construtor com parâmetros
  // Recebe os dados básicos do funcionário (name, hours, valuePerHour)
  // e também o valor adicional específico do terceirizado
  public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {

    // Chamada ao construtor da superclasse
    // Inicializa name, hours e valuePerHour na classe Employee
    super(name, hours, valuePerHour);

    // Inicializa o atributo específico da classe OutsourcedEmployee
    // Sem essa linha, additionalCharge ficaria null
    this.additionalCharge = additionalCharge;
  }

  // Retorna o valor da taxa adicional
  public Double getAdditionalCharge() {
    return additionalCharge;
  }

  // Permite alterar o valor da taxa adicional
  public void setAdditionalCharge(Double additionalCharge) {
    this.additionalCharge = additionalCharge;
  }

  // Sobrescrita do método payment()
  // Aqui acontece o POLIMORFISMO:
  // quando um Employee for, na verdade, um OutsourcedEmployee,
  // esse método será chamado automaticamente
  @Override
  public double payment() {

    // super.payment() calcula o pagamento base (hours * valuePerHour)
    // additionalCharge * 1.1 representa a taxa adicional com acréscimo de 10%
    return super.payment() + additionalCharge * 1.1;
  }
}
