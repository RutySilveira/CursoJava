package secao12EnumeracoesComposicao.exerciciosSecao12.exercicio2.application;
// Pacote da aplicação principal do exercício 2

import java.text.ParseException;
// Exceção lançada quando ocorre erro ao converter String para Date

import java.text.SimpleDateFormat;
// Classe usada para definir o formato de data e hora

import secao12EnumeracoesComposicao.exerciciosSecao12.exercicio2.entities.Comment;
// Importa a entidade Comment

import secao12EnumeracoesComposicao.exerciciosSecao12.exercicio2.entities.Post;
// Importa a entidade Post

public class Program {

  public static void main(String[] args) throws ParseException {
    // Método principal da aplicação
    // throws ParseException porque usamos sdf.parse()

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    // Define o formato de data e hora usado nos posts

    Comment c1 = new Comment("Have a nice trip!");
    // Cria o primeiro comentário do post 1

    Comment c2 = new Comment("Wow that's awesome!");
    // Cria o segundo comentário do post 1

    Post p1 = new Post(
        sdf.parse("21/06/2018 13:05:44"), // Data e hora do post
        "Traveling to New Zealand", // Título do post
        "I'm going to visit this wonderful country!", // Conteúdo
        12 // Quantidade de likes
    );
    // Cria o primeiro post com seus dados principais

    p1.addComment(c1);
    // Associa o comentário c1 ao post p1 (composição)

    p1.addComment(c2);
    // Associa o comentário c2 ao post p1

    Comment c3 = new Comment("Good night");
    // Cria o primeiro comentário do post 2

    Comment c4 = new Comment("May the Force be with you");
    // Cria o segundo comentário do post 2

    Post p2 = new Post(
        sdf.parse("28/07/2018 23:14:19"), // Data e hora do post
        "Good night guys", // Título do post
        "See you tomorrow", // Conteúdo
        5 // Quantidade de likes
    );
    // Cria o segundo post

    p2.addComment(c3);
    // Associa o comentário c3 ao post p2

    p2.addComment(c4);
    // Associa o comentário c4 ao post p2

    System.out.println(p1);
    // Chama automaticamente o método toString() do objeto p1
    // Exibe todas as informações do post e seus comentários

    System.out.println(p2);
    // Chama o toString() de p2 e exibe seus dados no console
  }
}
