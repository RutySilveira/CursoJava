package secao12EnumeracoesComposicao.exerciciosSecao12.exercicio1.entities;
// Pacote que contém as classes de entidades do sistema

import java.util.Date;
// Importa a classe Date para representar a data do contrato

public class HourContract {
  // Classe HourContract representa um contrato por hora
  // Essa classe será usada em composição com a classe Worker

  private Date date;
  // Data em que o contrato foi realizado
  // Usada posteriormente para calcular renda por mês/ano

  private Double valuePerHour;
  // Valor recebido por hora de trabalho

  private Integer hours;
  // Quantidade de horas trabalhadas nesse contrato

  public HourContract() {
    // Construtor padrão (sem parâmetros)
    // Permite criar um objeto vazio
    // Útil para frameworks ou inicialização posterior
  }

  public HourContract(Date date, Double valuePerHour, Integer hours) {
    // Construtor com parâmetros
    // Permite criar o contrato já com todos os dados definidos

    this.date = date;
    // Atribui a data do contrato ao atributo da classe

    this.valuePerHour = valuePerHour;
    // Atribui o valor por hora

    this.hours = hours;
    // Atribui a quantidade de horas trabalhadas
  }

  public Date getDate() {
    // Getter para acessar a data do contrato
    return date;
  }

  public void setDate(Date date) {
    // Setter para alterar a data do contrato
    this.date = date;
  }

  public Double getValuePerHour() {
    // Getter para acessar o valor pago por hora
    return valuePerHour;
  }

  public void setValuePerHour(Double valuePerHour) {
    // Setter para alterar o valor pago por hora
    this.valuePerHour = valuePerHour;
  }

  public Integer getHours() {
    // Getter para acessar a quantidade de horas trabalhadas
    return hours;
  }

  public void setHours(Integer hours) {
    // Setter para alterar a quantidade de horas trabalhadas
    this.hours = hours;
  }

  public double totalValue() {
    // Método de regra de negócio
    // Calcula o valor total recebido nesse contrato
    // Fórmula: valor por hora × número de horas
    return valuePerHour * hours;
  }

}
