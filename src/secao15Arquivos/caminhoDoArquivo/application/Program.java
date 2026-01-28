package secao15Arquivos.caminhoDoArquivo.application;

// Importa a classe File, usada para representar caminhos de arquivos ou diretórios
import java.io.File;

// Importa a classe Scanner para leitura de dados do teclado
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    // Cria um Scanner para ler a entrada do usuário
    Scanner sc = new Scanner(System.in);

    // Solicita ao usuário o caminho de um arquivo
    System.out.println("Enter a file path: ");
    String strPath = sc.nextLine();

    // Cria um objeto File a partir do caminho informado
    File path = new File(strPath);

    // Retorna apenas o nome do arquivo ou pasta (última parte do caminho)
    System.out.println("getName: " + path.getName());

    // Retorna o diretório pai do arquivo ou pasta
    // Pode retornar null se não houver diretório pai
    System.out.println("getParent: " + path.getParent());

    // Retorna o caminho completo informado
    System.out.println("getPath: " + path.getPath());

    // Fecha o Scanner para liberar recursos
    sc.close();
  }

}
