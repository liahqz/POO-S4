public class Main {
    public static void main(String[] args) {
        // 1. Criando um objeto da classe Cliente
        Cliente oCliente = new Cliente("Aron", 333666999);

        // 2. Chamando os métodos do objeto 'oCliente'
        System.out.println("--- Informações do Cliente ---");
        oCliente.exibirInfo();
        oCliente.pagar();
        System.out.println("O nome do cliente é: " + oCliente.getNome());

        System.out.println("\n----------------------------\n");

        // 3. Criando um objeto da classe Gerente
        Gerente oGerente = new Gerente("Lívia", "Tons de Roxo");

        // 4. Chamando os métodos do objeto 'oGerente'
        System.out.println("--- Informações do Gerente ---");
        oGerente.exibirInfo();
        oGerente.reclamar();
        System.out.println("O nome da loja é: " + oGerente.getNome_loja());
    }
} 