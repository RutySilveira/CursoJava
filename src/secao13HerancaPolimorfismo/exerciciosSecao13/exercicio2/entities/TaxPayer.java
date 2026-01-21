package secao13HerancaPolimorfismo.exerciciosSecao13.exercicio2.entities;

/*
 * Classe abstrata TaxPayer (Contribuinte)
 * 
 * Essa classe representa um MODELO genérico de contribuinte.
 * Ela NÃO pode ser instanciada diretamente.
 * 
 * A ideia é que outras classes herdem dela,
 * como por exemplo:
 * - IndividualTaxPayer
 * - CompanyTaxPayer
 */
public abstract class TaxPayer {

  // Nome do contribuinte
  private String name;

  // Renda anual do contribuinte
  private Double anualIncome;

  // Construtor vazio
  // Necessário para frameworks e também para flexibilidade
  public TaxPayer() {
  }

  /*
   * Construtor com argumentos
   * Usado para inicializar os atributos no momento da criação do objeto
   */
  public TaxPayer(String name, Double anualIncome) {
    this.name = name;
    this.anualIncome = anualIncome;
  }

  // Getter do nome
  public String getName() {
    return name;
  }

  // Setter do nome
  public void setName(String name) {
    this.name = name;
  }

  // Getter da renda anual
  public Double getAnualIncome() {
    return anualIncome;
  }

  /*
   * Setter da renda anual
   * OBS: há um pequeno erro de digitação no nome do método:
   * setAnuallncome -> o ideal seria setAnualIncome
   */
  public void setAnuallncome(Double anualIncome) {
    this.anualIncome = anualIncome;
  }

  /*
   * Método abstrato tax()
   * 
   * - NÃO possui implementação aqui
   * - Obriga as classes filhas a implementarem sua própria lógica
   * 
   * Cada tipo de contribuinte calcula o imposto de forma diferente.
   * Por isso, esse método é abstrato.
   */
  public abstract double tax();

}
