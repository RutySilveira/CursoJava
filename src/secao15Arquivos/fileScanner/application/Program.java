package secao15Arquivos.fileScanner.application;

// Importa a classe File para representar o arquivo no sistema
import java.io.File;

// Importa IOException para tratamento de erros relacionados a entrada e saída
import java.io.IOException;

// Importa Scanner para leitura de dados (neste caso, leitura de arquivo)
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    // Cria um objeto File apontando para o caminho do arquivo de texto
    // As barras invertidas precisam ser escapadas com \\ dentro da String
    File file = new File("C:\\Windows\\Temp\\in.txt");

    // Declara o Scanner fora do try para poder fechá-lo no bloco finally
    Scanner sc = null;

    try {
      // Inicializa o Scanner para ler o conteúdo do arquivo
      sc = new Scanner(file);

      // Enquanto existir uma próxima linha no arquivo
      while (sc.hasNextLine()) {

        // Lê e imprime a linha atual do arquivo
        System.out.println(sc.nextLine());
      }
    }
    // Captura exceções relacionadas a problemas de entrada e saída
    // (ex.: arquivo não encontrado ou erro de leitura)
    catch (IOException e) {

      // Exibe a mensagem de erro gerada pela exceção
      System.out.println("Error: " + e.getMessage());
    } finally {
      // Bloco executado sempre, ocorrendo erro ou não

      // Verifica se o Scanner foi inicializado
      if (sc != null) {

        // Fecha o Scanner para liberar o recurso do sistema
        sc.close();
      }
    }
  }
}
