package secao13HerancaPolimorfismo.exerciciosSecao13.exercicio2.entities;

/*
 * Classe Company
 * 
 * Representa um contribuinte do tipo Pessoa Jurídica (empresa).
 * Essa classe HERDA de TaxPayer.
 * 
 * Diferente da classe Individual, aqui o imposto
 * depende da quantidade de funcionários da empresa.
 */
public class Company extends TaxPayer {

  // Número de funcionários da empresa
  // Esse valor define a alíquota de imposto
  private Integer numberOfEmployees;

  // Construtor vazio
  // Necessário para flexibilidade e frameworks
  public Company() {
  }

  /*
   * Construtor com argumentos
   * 
   * Inicializa os atributos da classe mãe (TaxPayer)
   * e o atributo específico da empresa
   */
  public Company(String name, Double anualIncome, Integer numberOfEmployees) {
    super(name, anualIncome);
    this.numberOfEmployees = numberOfEmployees;
  }

  // Getter do número de funcionários
  public Integer getNumberOfEmployees() {
    return numberOfEmployees;
  }

  /*
   * Setter do número de funcionários
   * OBS: o nome ideal do método seria setNumberOfEmployees
   */
  public void setNumberEmployees(Integer numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }

  /*
   * Implementação do método abstrato tax()
   * 
   * Aqui ocorre POLIMORFISMO:
   * a classe Company define sua própria forma
   * de calcular o imposto.
   */
  @Override
  public double tax() {

    /*
     * Regra de negócio:
     * - Empresas com MAIS de 10 funcionários:
     * pagam 14% de imposto
     * - Empresas com ATÉ 10 funcionários:
     * pagam 16% de imposto
     */
    if (numberOfEmployees > 10) {
      return getAnualIncome() * 0.14;
    } else {
      return getAnualIncome() * 0.16;
    }
  }

}
