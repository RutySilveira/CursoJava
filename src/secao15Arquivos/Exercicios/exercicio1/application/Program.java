package secao15Arquivos.Exercicios.exercicio1.application;

// Importações para leitura e escrita de arquivos
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Importações utilitárias
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

// Importa a entidade Product
import secao15Arquivos.Exercicios.exercicio1.entities.Product;

public class Program {

  public static void main(String[] args) throws ParseException {

    // Define o padrão de formatação numérica para US
    // (garante uso de ponto como separador decimal)
    Locale.setDefault(Locale.US);

    // Scanner para leitura da entrada do usuário
    Scanner sc = new Scanner(System.in);

    // Lista que armazenará os produtos lidos do arquivo CSV
    List<Product> list = new ArrayList<>();

    // Solicita o caminho do arquivo de origem
    System.out.println("Enter file path: ");
    String sourceFileStr = sc.nextLine();

    // Cria um objeto File para o arquivo de origem
    File sourceFile = new File(sourceFileStr);

    // Obtém o diretório pai do arquivo de origem
    String sourceFolderStr = sourceFile.getParent();

    // Cria uma pasta "out" dentro do diretório do arquivo de origem
    boolean success = new File(sourceFolderStr + "\\out").mkdir();

    // Define o caminho do arquivo de saída summary.csv
    String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

    // Abre o arquivo de origem para leitura
    try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

      // Lê a primeira linha do arquivo
      String itemCsv = br.readLine();

      // Enquanto houver linhas para serem lidas
      while (itemCsv != null) {

        // Separa os dados da linha pelo separador vírgula
        String[] fields = itemCsv.split(",");

        // Atribui os campos às variáveis
        String name = fields[0];
        double price = Double.parseDouble(fields[1]);
        int quantity = Integer.parseInt(fields[2]);

        // Cria um objeto Product e adiciona à lista
        list.add(new Product(name, price, quantity));

        // Lê a próxima linha do arquivo
        itemCsv = br.readLine();
      }

      // Abre o arquivo de destino para escrita
      try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

        // Percorre a lista de produtos
        for (Product item : list) {

          // Escreve no CSV o nome do produto e o valor total (preço * quantidade)
          // O valor é formatado com duas casas decimais
          bw.write(item.getName() + "," + String.format("%.2f", item.total()));
          bw.newLine();
        }

        // Confirma a criação do arquivo de saída
        System.out.println(targetFileStr + " CREATED!");

      } catch (IOException e) {
        // Erro ao escrever o arquivo de saída
        System.out.println("Error writing file: " + e.getMessage());
      }

    } catch (IOException e) {
      // Erro ao ler o arquivo de entrada
      System.out.println("Error reading file: " + e.getMessage());
    }

    // Fecha o Scanner
    sc.close();
  }
}
