// Define o pacote onde a classe está localizada
package secao8IntroducaoPOO.util;

// Declaração da classe utilitária CurrencyConverter
public class CurrencyConverter {

  // Taxa de IOF (Imposto sobre Operações Financeiras) usada na conversão de dólar
  // para real
  // Está definida como 6% (0.06)
  public static double IOF = 0.06;

  // Método estático que realiza a conversão de dólar para real
  // Parâmetros:
  // - amount: quantidade de dólares a ser comprada
  // - dollarPrice: cotação do dólar
  // Retorna o valor total a pagar em reais, já com IOF incluído
  public static double dollarToReal(double amount, double dollarPrice) {
    // Cálculo: valor em dólares * cotação * (1 + IOF)
    return amount * dollarPrice * (1.0 + IOF);
  }

}
