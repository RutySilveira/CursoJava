package secao14TratamentoDeExcecoes.excecoesPersonalizadas.model.entities;

// Importa a classe Date para trabalhar com datas (check-in e check-out)
import java.util.Date;

// Importa SimpleDateFormat para formatar datas no padrão brasileiro (dd/MM/yyyy)
import java.text.SimpleDateFormat;

// Importa TimeUnit para facilitar a conversão de tempo (milissegundos para dias)
import java.util.concurrent.TimeUnit;

// Importa a exceção personalizada usada para regras de negócio da reserva
import secao14TratamentoDeExcecoes.excecoesPersonalizadas.model.exceptions.DomainException;

public class Reservation {

  // Número do quarto da reserva
  private Integer roomNumber;

  // Data de entrada do hóspede
  private Date checkIn;

  // Data de saída do hóspede
  private Date checkOut;

  // Formatter estático para evitar criar várias instâncias
  // Define o formato padrão de exibição das datas
  private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  // Construtor da classe Reservation
  // Garante que uma reserva já seja criada em um estado válido
  public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {

    // Validação de regra de negócio:
    // O check-out precisa ser depois do check-in
    if (!checkOut.after(checkIn)) {
      // Lança uma exceção personalizada indicando erro de domínio
      throw new DomainException("Check-out date must be after check-in date");
    }

    // Atribuição dos valores aos atributos da classe
    this.roomNumber = roomNumber;
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

  // Retorna o número do quarto
  public Integer getRoomNumber() {
    return roomNumber;
  }

  // Permite alterar o número do quarto
  public void setRoomNumber(Integer roomNumber) {
    this.roomNumber = roomNumber;
  }

  // Retorna a data de check-in
  public Date getCheckIn() {
    return checkIn;
  }

  // Retorna a data de check-out
  public Date getCheckOut() {
    return checkOut;
  }

  // Calcula a duração da reserva em dias (número de noites)
  public long duration() {

    // Diferença entre check-out e check-in em milissegundos
    long diff = checkOut.getTime() - checkIn.getTime();

    // Converte a diferença de milissegundos para dias
    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
  }

  // Atualiza as datas da reserva
  public void updateDates(Date checkIn, Date checkOut) {

    // Data atual do sistema
    Date now = new Date();

    // Regra de negócio:
    // Não é permitido atualizar a reserva para datas no passado
    if (checkIn.before(now) || checkOut.before(now)) {
      throw new DomainException("Reservation dates for update must be future dates");
    }

    // Regra de negócio:
    // O check-out precisa ser depois do check-in
    if (!checkOut.after(checkIn)) {
      throw new DomainException("Check-out date must be after check-in date");
    }

    // Atualiza os atributos apenas se todas as validações passarem
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

  // Sobrescreve o método toString para exibir a reserva de forma amigável
  @Override
  public String toString() {
    return "Room "
        + roomNumber
        + ", check-in: "
        + sdf.format(checkIn) // Formata a data de check-in
        + ", check-out: "
        + sdf.format(checkOut) // Formata a data de check-out
        + ", "
        + duration()
        + " nights";
  }
}
