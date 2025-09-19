// Crie um código para uma loja, onde tenha o nome dos clientes e pelo menos duas informações básicas sobre eles. (Em bloco) 
public class Gerente {
    // Atributos da classe Gerente
    private String nome;
    private String nome_loja;

    // Construtor da classe Gato
    public Gerente(String nome, String nome_loja) {
        this.nome = nome;
        this.nome_loja = nome_loja;
    }

    // Método para o gerente reclamar
    public void reclamar() {
        System.out.println(this.nome + " está reclamando.");
    }

    // Método para exibir informações do gerente
    public void exibirInfo() {
        System.out.println("Nome: " + this.nome + "\nÉ gerente da loja: " + this.nome_loja + ".");
    }

    // Métodos Getters (para acessar os atributos privados)
    public String getNome() {
        return nome;
    }

    public String getNome_loja() {
        return nome_loja;
    }
}