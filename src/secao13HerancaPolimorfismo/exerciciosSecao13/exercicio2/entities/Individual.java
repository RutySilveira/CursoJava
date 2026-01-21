package secao13HerancaPolimorfismo.exerciciosSecao13.exercicio2.entities;

/*
 * Classe Individual
 * 
 * Representa um contribuinte do tipo Pessoa Física.
 * Essa classe HERDA de TaxPayer, ou seja:
 * - recebe os atributos name e anualIncome
 * - é obrigada a implementar o método tax()
 */
public class Individual extends TaxPayer {

  // Gastos com saúde do contribuinte
  // Esse valor influencia diretamente no cálculo do imposto
  private Double healthExpenditures;

  // Construtor vazio
  // Necessário para flexibilidade e para frameworks
  public Individual() {
  }

  /*
   * Construtor com argumentos
   * 
   * Chama o construtor da classe mãe (TaxPayer)
   * usando super(name, anualIncome)
   * e inicializa o gasto com saúde
   */
  public Individual(String name, Double anualIncome, Double healthExpenditures) {
    super(name, anualIncome);
    this.healthExpenditures = healthExpenditures;
  }

  // Getter dos gastos com saúde
  public Double getHealthExpenditures() {
    return healthExpenditures;
  }

  // Setter dos gastos com saúde
  public void setHealthExpenditures(Double healthExpenditures) {
    this.healthExpenditures = healthExpenditures;
  }

  /*
   * Implementação do método abstrato tax()
   * 
   * Aqui ocorre POLIMORFISMO:
   * esse método sobrescreve (override) o método tax()
   * definido na classe TaxPayer.
   */
  @Override
  public double tax() {

    // Variável auxiliar para armazenar o imposto base
    double basicTax;

    /*
     * Regra de negócio:
     * - Se a renda anual for menor que 20.000:
     * imposto de 15%
     * - Caso contrário:
     * imposto de 25%
     */
    if (getAnualIncome() < 20000.0) {
      basicTax = getAnualIncome() * 0.15;
    } else {
      basicTax = getAnualIncome() * 0.25;
    }

    /*
     * Desconto de 50% dos gastos com saúde
     * Esse valor é abatido do imposto calculado
     */
    basicTax = basicTax - getHealthExpenditures() * 0.5;

    /*
     * Garante que o imposto nunca seja negativo
     * Caso o desconto seja maior que o imposto,
     * o valor final será zero.
     */
    if (basicTax < 0.0) {
      basicTax = 0.0;
    }

    // Retorna o valor final do imposto
    return basicTax;
  }

}
