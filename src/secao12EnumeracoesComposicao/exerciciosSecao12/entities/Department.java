package secao12EnumeracoesComposicao.exerciciosSecao12.entities;
// Pacote que contém as classes de entidades do domínio do sistema

public class Department {
  // Classe Department representa um DEPARTAMENTO da empresa
  // Essa classe será usada em composição com a classe Worker

  private String name;
  // Atributo privado que armazena o nome do departamento
  // Encapsulamento: acesso controlado por getters e setters

  public Department() {
    // Construtor padrão (sem parâmetros)
    // Necessário para frameworks, serialização ou criação do objeto vazio
  }

  public Department(String name) {
    // Construtor com parâmetro
    // Permite criar o departamento já com o nome definido
    this.name = name;
  }

  public String getName() {
    // Getter: método público para acessar o nome do departamento
    return name;
  }

  public void setName(String name) {
    // Setter: método público para alterar o nome do departamento

    this.name = name;
  }

}
