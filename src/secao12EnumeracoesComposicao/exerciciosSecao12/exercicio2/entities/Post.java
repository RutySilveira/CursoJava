package secao12EnumeracoesComposicao.exerciciosSecao12.exercicio2.entities;
// Pacote das entidades do exercício 2 (Post e Comment)

import java.text.SimpleDateFormat;
// Classe usada para formatar a data e hora do post

import java.util.ArrayList;
// Implementação concreta da interface List

import java.util.Date;
// Classe que representa data e hora

import java.util.List;
// Interface List para trabalhar com coleções de forma genérica

public class Post {
  // Classe Post representa uma publicação (ex: rede social, blog)
  // Essa classe possui uma relação de COMPOSIÇÃO com Comment (1 para N)

  private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
  // Formatter estático para converter Date em String
  // static: um único objeto compartilhado por todos os Posts

  private Date moment;
  // Data e hora em que o post foi criado

  private String title;
  // Título do post

  private String content;
  // Conteúdo/texto principal do post

  private Integer likes;
  // Quantidade de curtidas do post

  private List<Comment> comments = new ArrayList<>();
  // Lista de comentários associados ao post
  // Inicializada diretamente para evitar NullPointerException
  // Representa a composição: um Post TEM vários Comments

  public Post() {
    // Construtor padrão (sem parâmetros)
    // Permite criar um Post vazio
  }

  public Post(Date moment, String title, String content, Integer likes) {
    // Construtor com parâmetros
    // Cria o Post já com seus principais dados definidos

    this.moment = moment;
    this.title = title;
    this.content = content;
    this.likes = likes;
  }

  public Date getMoment() {
    // Getter da data/hora do post
    return moment;
  }

  public void setMoment(Date moment) {
    // Setter da data/hora do post
    this.moment = moment;
  }

  public String getTitle() {
    // Getter do título do post
    return title;
  }

  public void setTitle(String title) {
    // Setter do título do post
    this.title = title;
  }

  public String getContent() {
    // Getter do conteúdo do post
    return content;
  }

  public void setContent(String content) {
    // Setter do conteúdo do post
    this.content = content;
  }

  public Integer getLikes() {
    // Getter da quantidade de curtidas
    return likes;
  }

  public void setLikes(Integer likes) {
    // Setter da quantidade de curtidas
    this.likes = likes;
  }

  public List<Comment> getComments() {
    // Retorna a lista de comentários
    // OBS: não há setter para comments para proteger a lista
    return comments;
  }

  // Metodos

  public void addComment(Comment comment) {
    // Adiciona um comentário à lista
    comments.add(comment);
  }

  public void removeComment(Comment comment) {
    // Remove um comentário da lista
    comments.remove(comment);
  }

  public String toString() {
    // Sobrescrita do método toString()
    // Define como o objeto Post será exibido como texto

    StringBuilder sb = new StringBuilder();
    // StringBuilder é usado para montar Strings de forma eficiente

    sb.append(title + "\n");
    // Adiciona o título do post

    sb.append(likes);
    sb.append(" Likes - ");
    // Adiciona a quantidade de likes e o texto fixo

    sb.append(sdf.format(moment) + "\n");
    // Formata a data/hora do post usando o SimpleDateFormat

    sb.append(content + "\n");
    // Adiciona o conteúdo do post

    sb.append("Comments:\n");
    // Cabeçalho da seção de comentários

    for (Comment c : comments) {
      // Percorre todos os comentários associados ao post
      sb.append(c.getText() + "\n");
      // Adiciona o texto de cada comentário
    }

    return sb.toString();
    // Retorna a String final montada
  }
}
