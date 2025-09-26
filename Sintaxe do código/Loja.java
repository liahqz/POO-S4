// import java = importa um pacote
public class Loja { // nome da classe; public: podemos acessar essa classe em qualquer parte do código

    public static void main(String[] args) { // main é o método principal
        Cliente cliente1 = new Cliente(); // criando uma instãncia da classe CadastroDeClientes
        
        cliente1.setNome("Maria Silva"); // definindo o nome do cliente 1
        cliente1.setCpf("123.456.789-00"); // definindo o CPF do cliente 1
        cliente1.setEmail("maria.silva@email.com"); // definindo o Email do cliente 1

        System.out.println("--- Dados do Cliente Cadastrado ---"); // mostrar os dados obtidos
        System.out.println("Nome: " + cliente1.getNome()); // mostrando nome do cliente 1
        System.out.println("CPF: " + cliente1.getCpf()); // mostrando CPF do cliente 1
        System.out.println("Email: " + cliente1.getEmail()); // mostrando Email do cliente 1
    }
}