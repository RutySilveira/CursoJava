package secao12EnumeracoesComposicao.exerciciosSecao12.exercicio1.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import secao12EnumeracoesComposicao.exerciciosSecao12.exercicio1.entities.enums.WorkerLevel;

public class Worker {

  // Nome do trabalhador
  private String name;

  // Nível do trabalhador (enum: JUNIOR, MID_LEVEL, SENIOR, etc.)
  private WorkerLevel level;

  // Salário base do trabalhador
  private Double baseSalary;

  // Departamento ao qual o trabalhador pertence
  private Department department;

  // Lista de contratos por hora associados ao trabalhador
  // Já é inicializada para evitar NullPointerException
  private List<HourContract> contracts = new ArrayList<>();

  // Construtor padrão (necessário para frameworks e flexibilidade)
  public Worker() {
  }

  // Construtor com parâmetros principais
  public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
    this.name = name;
    this.level = level;
    this.baseSalary = baseSalary;
    this.department = department;
  }

  // =========================
  // GETTERS E SETTERS
  // =========================

  // Retorna o nome do trabalhador
  public String getName() {
    return name;
  }

  // Define/atualiza o nome do trabalhador
  public void setName(String name) {
    this.name = name;
  }

  // Retorna o nível do trabalhador
  public WorkerLevel getLevel() {
    return level;
  }

  // Define/atualiza o nível do trabalhador
  public void setLevel(WorkerLevel level) {
    this.level = level;
  }

  // Retorna o salário base do trabalhador
  public Double getBaseSalary() {
    return baseSalary;
  }

  // Define/atualiza o salário base do trabalhador
  public void setBaseSalary(Double baseSalary) {
    this.baseSalary = baseSalary;
  }

  // Retorna o departamento do trabalhador
  public Department getDepartment() {
    return department;
  }

  // Define/atualiza o departamento do trabalhador
  public void setDepartment(Department department) {
    this.department = department;
  }

  // Retorna a lista de contratos do trabalhador
  // OBS: não é comum criar set para a lista inteira
  // para manter o controle dos contratos (boa prática)
  public List<HourContract> getContracts() {
    return contracts;
  }

  // =========================
  // MÉTODOS DE NEGÓCIO
  // =========================

  // Adiciona um contrato à lista de contratos do trabalhador.
  // Esse método mantém o controle da composição Worker -> HourContract.
  public void addContract(HourContract contract) {
    contracts.add(contract);
  }

  // Remove um contrato específico da lista de contratos do trabalhador.
  // A remoção é feita com base no objeto passado como parâmetro.
  public void removeContract(HourContract contract) {
    contracts.remove(contract);
  }

  // Calcula a renda total do trabalhador em um determinado mês e ano.
  // A renda é composta pelo salário base + valor dos contratos daquele período.
  public double income(int year, int month) {

    // Inicializa a soma com o salário base do trabalhador.
    double sum = baseSalary;

    // Cria uma instância da classe Calendar para manipular datas.
    Calendar cal = Calendar.getInstance();

    // Percorre todos os contratos associados ao trabalhador.
    for (HourContract c : contracts) {

      // Define a data do calendário como a data do contrato atual.
      cal.setTime(c.getDate());

      // Obtém o ano do contrato.
      int c_year = cal.get(Calendar.YEAR);

      // Obtém o mês do contrato.
      // Calendar.MONTH começa em 0 (janeiro = 0),
      // por isso somamos 1 para ficar no formato convencional (1 a 12).
      int c_month = 1 + cal.get(Calendar.MONTH);

      // Verifica se o contrato pertence ao ano e mês informados.
      if (year == c_year && month == c_month) {

        // Soma ao total o valor do contrato
        // (horas trabalhadas * valor por hora).
        sum += c.totalValue();
      }
    }

    // Retorna a renda total calculada para o período.
    return sum;
  }
}
