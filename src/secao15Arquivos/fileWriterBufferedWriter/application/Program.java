package secao15Arquivos.fileWriterBufferedWriter.application;

// Importa a classe BufferedWriter, usada para escrever texto em um arquivo de forma eficiente
import java.io.BufferedWriter;

// Importa a classe FileWriter, responsável por criar ou abrir um arquivo para escrita
import java.io.FileWriter;

// Importa a classe IOException, usada para tratar erros de entrada e saída
import java.io.IOException;

public class Program {

  public static void main(String[] args) {

    // Vetor de Strings contendo as linhas que serão escritas no arquivo
    String[] lines = new String[] {
        "Good morning",
        "Good afternoon",
        "Good night"
    };

    // Caminho do arquivo onde os dados serão gravados
    // Se o arquivo não existir, ele será criado
    String path = "C:\\Windows\\Temp\\out.txt";

    // Bloco try-with-resources:
    // garante que o BufferedWriter será fechado automaticamente ao final do uso
    // O segundo parâmetro do FileWriter (true) indica que o conteúdo será
    // ADICIONADO ao arquivo,
    // e não sobrescrito
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

      // Percorre cada String do vetor lines
      for (String line : lines) {

        // Escreve a linha atual no arquivo
        bw.write(line);

        // Quebra de linha no arquivo (equivalente a \n, mas portátil)
        bw.newLine();
      }

    } catch (IOException e) {
      // Captura e exibe possíveis erros de escrita ou acesso ao arquivo
      e.printStackTrace();
    }
  }
}
