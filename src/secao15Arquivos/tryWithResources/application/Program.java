package secao15Arquivos.tryWithResources.application;

// Importa BufferedReader para leitura eficiente de arquivos texto (linha por linha)
import java.io.BufferedReader;

// Importa FileReader para leitura básica de caracteres a partir de um arquivo
import java.io.FileReader;

// Importa IOException para tratar erros de entrada e saída
import java.io.IOException;

public class Program {

  // Método principal da aplicação
  // Ponto de entrada do programa Java
  public static void main(String[] args) {

    // Caminho do arquivo que será lido
    // As barras invertidas precisam ser escapadas com \\ dentro da String
    String path = "C:\\Windows\\Temp\\in.txt";

    // ===== TRY-WITH-RESOURCES =====
    // Tudo que for declarado entre parênteses no try:
    // - Deve implementar AutoCloseable
    // - Será fechado automaticamente ao final do bloco
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      // Lê a primeira linha do arquivo
      // Se o arquivo estiver vazio, retorna null
      String line = br.readLine();

      // Enquanto houver linhas para serem lidas
      while (line != null) {

        // Imprime a linha atual no console
        System.out.println(line);

        // Lê a próxima linha do arquivo
        line = br.readLine();
      }
    }
    // Captura erros relacionados à leitura do arquivo
    // (arquivo inexistente, erro de leitura, permissão, etc.)
    catch (IOException e) {

      // Exibe a mensagem de erro associada à exceção
      System.out.println("Error: " + e.getMessage());
    }

    // Não é necessário finally aqui:
    // O BufferedReader (e o FileReader interno) são fechados automaticamente
  }
}
