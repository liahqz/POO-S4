public class Cliente {
    // Atributos da classe Cliente
    private String nome;
    private int CPF;

    // Construtor da classe Cliente
    public Cliente(String nome, int CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    // Método para o cliente pagar
    public void pagar() {
        System.out.println(this.nome + " está pagando.");
    }

    // Método para exibir informações do cliente
    public void exibirInfo() {
        System.out.println("Nome: " + this.nome + "\nCPF: " + this.CPF + ".");
    }

    // Métodos Getters (para acessar os atributos privados)
    public String getNome() {
        return nome;
    }

    public int getCPF() {
        return CPF;
    }
}