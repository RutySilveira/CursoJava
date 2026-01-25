package secao14TratamentoDeExcecoes.blocoFinally.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    // Cria um objeto File que representa o arquivo no caminho informado.
    // IMPORTANTE: aqui o arquivo ainda NÃO está sendo aberto,
    // apenas estamos criando uma referência para ele.
    File file = new File("C:\\temp\\in.txt");

    // Declaração do Scanner fora do bloco try.
    // Isso é necessário para que ele possa ser acessado
    // tanto no try quanto no finally.
    Scanner sc = null;

    try {
      // Tenta criar o Scanner associado ao arquivo.
      // Neste momento, o Java tenta abrir o arquivo no sistema.
      // Se o arquivo não existir, uma exceção será lançada.
      sc = new Scanner(file);

      // Enquanto houver uma próxima linha no arquivo...
      while (sc.hasNextLine()) {

        // Lê a próxima linha do arquivo
        // e imprime no console.
        System.out.println(sc.nextLine());
      }

    } catch (FileNotFoundException e) {
      // Este bloco catch é executado se o arquivo não for encontrado.
      // FileNotFoundException é uma exceção verificada (checked),
      // por isso precisa ser tratada.
      System.out.println("Error opening file: " + e.getMessage());

    } finally {
      // O bloco finally é executado SEMPRE:
      // - ocorrendo erro
      // - ou não ocorrendo erro

      // Verifica se o Scanner foi criado corretamente.
      // Se houve erro antes da criação, sc continuará null.
      if (sc != null) {

        // Fecha o Scanner, liberando o recurso do sistema.
        // Isso é MUITO importante para evitar vazamento de recursos.
        sc.close();
      }

      // Mensagem apenas para demonstrar que o bloco finally foi executado.
      System.out.println("Finally block executed");
    }
  }

}
