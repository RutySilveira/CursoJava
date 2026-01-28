package secao15Arquivos.manipulandoPastasComFile.application;

// Importa a classe File, usada para trabalhar com arquivos e pastas
import java.io.File;

// Importa a classe Scanner para leitura de dados do teclado
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    // Cria um Scanner para ler dados digitados pelo usuário
    Scanner sc = new Scanner(System.in);

    // Solicita ao usuário o caminho de uma pasta
    System.out.println("Enter a folder path: ");
    String strPath = sc.nextLine();

    // Cria um objeto File representando o caminho informado
    File path = new File(strPath);

    // Obtém todas as subpastas do diretório informado
    // File::isDirectory filtra apenas diretórios
    File[] folders = path.listFiles(File::isDirectory);

    // Exibe o título da listagem de pastas
    System.out.println("FOLDERS:");

    // Percorre e imprime cada pasta encontrada
    for (File folder : folders) {
      System.out.println(folder);
    }

    // Obtém todos os arquivos do diretório informado
    // File::isFile filtra apenas arquivos
    File[] files = path.listFiles(File::isFile);

    // Exibe o título da listagem de arquivos
    System.out.println("FILES:");

    // Percorre e imprime cada arquivo encontrado
    for (File file : files) {
      System.out.println(file);
    }

    // Cria uma nova subpasta chamada "subdir" dentro do caminho informado
    // mkdir() retorna true se a pasta foi criada com sucesso
    boolean success = new File(strPath + "\\subdir").mkdir();

    // Exibe se a criação da pasta foi bem-sucedida ou não
    System.out.println("Directory created sucessfully: " + success);

    // Fecha o Scanner para liberar recursos
    sc.close();

  }

}
