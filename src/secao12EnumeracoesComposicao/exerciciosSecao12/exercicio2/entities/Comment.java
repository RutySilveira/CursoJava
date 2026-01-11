package secao12EnumeracoesComposicao.exerciciosSecao12.exercicio2.entities;
// Pacote das entidades do exercício 2

// Mantém a organização do projeto por exercício e responsabilidade

public class Comment {
  // Classe Comment representa um comentário
  // Normalmente usada em composição com outra classe (ex: Post)

  private String text;
  // Atributo privado que armazena o texto do comentário
  // Encapsulamento: acesso controlado por getter e setter

  public Comment() {
    // Construtor padrão (sem parâmetros)
    // Permite criar um comentário vazio
    // Útil para frameworks ou inicialização posterior
  }

  public Comment(String text) {
    // Construtor com parâmetro
    // Permite criar o comentário já com o texto definido
    this.text = text;
  }

  public String getText() {
    // Getter: retorna o texto do comentário
    return text;
  }

  public void setText(String text) {
    // Setter: altera o texto do comentário
    this.text = text;
  }
}
