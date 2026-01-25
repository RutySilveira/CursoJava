package secao14TratamentoDeExcecoes.excecoesPersonalizadas.application;

// Importa a classe Date para trabalhar com datas
import java.util.Date;

// Importa ParseException, lançada quando o formato da data está incorreto
import java.text.ParseException;

// Importa SimpleDateFormat para converter String em Date
import java.text.SimpleDateFormat;

// Importa Scanner para leitura de dados do usuário
import java.util.Scanner;

// Importa a entidade Reservation (regra de negócio da reserva)
import secao14TratamentoDeExcecoes.excecoesPersonalizadas.model.entities.Reservation;

// Importa a exceção personalizada de domínio
import secao14TratamentoDeExcecoes.excecoesPersonalizadas.model.exceptions.DomainException;

public class Program {

  public static void main(String[] args) {

    // Scanner para entrada de dados pelo teclado
    Scanner sc = new Scanner(System.in);

    // Define o formato esperado das datas (dia/mês/ano)
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    try {
      // ===== LEITURA DOS DADOS INICIAIS DA RESERVA =====

      System.out.print("Room number: ");
      int number = sc.nextInt(); // Lê o número do quarto

      System.out.print("Check-in date (dd/MM/yyyy): ");
      // Converte a data digitada (String) para Date
      Date checkIn = sdf.parse(sc.next());

      System.out.print("Check-out date (dd/MM/yyyy): ");
      // Converte a data digitada (String) para Date
      Date checkOut = sdf.parse(sc.next());

      // Cria a reserva
      // Aqui podem ocorrer exceções de domínio (datas inválidas)
      Reservation reservation = new Reservation(number, checkIn, checkOut);

      // Exibe os dados da reserva usando o toString sobrescrito
      System.out.println("Reservation: " + reservation);

      System.out.println();
      System.out.println("Enter data to update the reservation:");

      // ===== ATUALIZAÇÃO DAS DATAS DA RESERVA =====

      System.out.print("Check-in date (dd/MM/yyyy): ");
      checkIn = sdf.parse(sc.next());

      System.out.print("Check-out date (dd/MM/yyyy): ");
      checkOut = sdf.parse(sc.next());

      // Atualiza as datas da reserva
      // Pode lançar DomainException se as regras de negócio forem violadas
      reservation.updateDates(checkIn, checkOut);

      // Exibe a reserva atualizada
      System.out.println("Reservation: " + reservation);

    }
    // Captura erro de conversão de data (formato inválido)
    catch (ParseException e) {
      System.out.println("Invalid date format");
    }
    // Captura erros de regra de negócio definidos pelo domínio
    catch (DomainException e) {
      System.out.println("Error in reservation: " + e.getMessage());
    }
    // Captura qualquer outro erro inesperado em tempo de execução
    catch (RuntimeException e) {
      System.out.println("Unexpected error");
    }

    // Fecha o Scanner para liberar recursos
    sc.close();
  }
}
