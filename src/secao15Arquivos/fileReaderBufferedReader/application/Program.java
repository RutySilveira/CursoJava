package secao15Arquivos.fileReaderBufferedReader.application;

// Importa BufferedReader, que permite leitura eficiente de arquivos texto linha por linha
import java.io.BufferedReader;

// Importa FileReader, responsável por fazer a leitura básica de caracteres de um arquivo
import java.io.FileReader;

// Importa IOException, exceção lançada em operações de entrada e saída
import java.io.IOException;

public class Program {

  // Método principal do programa
  // Ponto de entrada da aplicação Java
  public static void main(String[] args) {

    // Caminho do arquivo a ser lido
    // As barras invertidas precisam ser escapadas com \\ dentro da String
    String path = "C:\\Windows\\Temp\\ina.txt";

    // Declaração dos objetos FileReader e BufferedReader fora do try
    // Isso permite que eles sejam fechados no bloco finally
    FileReader fr = null;
    BufferedReader br = null;

    try {
      // Cria o FileReader associado ao arquivo do caminho informado
      // Se o arquivo não existir, uma IOException será lançada aqui
      fr = new FileReader(path);

      // Cria o BufferedReader envolvendo o FileReader
      // O BufferedReader melhora a performance da leitura
      br = new BufferedReader(fr);

      // Lê a primeira linha do arquivo
      // Se o arquivo estiver vazio, retorna null
      String line = br.readLine();

      // Enquanto existir conteúdo no arquivo
      while (line != null) {

        // Imprime a linha atual no console
        System.out.println(line);

        // Lê a próxima linha do arquivo
        line = br.readLine();
      }
    }
    // Captura qualquer erro relacionado à leitura do arquivo
    // (arquivo inexistente, erro de leitura, permissão, etc.)
    catch (IOException e) {

      // Exibe a mensagem de erro da exceção
      System.out.println("Error: " + e.getMessage());
    } finally {
      // Bloco executado sempre, com erro ou sem erro

      try {
        // Verifica se o BufferedReader foi inicializado
        if (br != null) {

          // Fecha o BufferedReader e libera o recurso
          br.close();
        }

        // Verifica se o FileReader foi inicializado
        if (fr != null) {

          // Fecha o FileReader e libera o recurso
          fr.close();
        }
      }
      // Trata possíveis erros ao fechar os recursos
      catch (IOException e) {

        // Imprime o rastreamento do erro no console (stack trace)
        e.printStackTrace();
      }
    }
  }
}
