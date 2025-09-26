public class Cliente {

    // Atributos
    private String nome; // váriavel nome, tipo string; private porque só podemos acessar nesta classe
    private String cpf; // váriavel CPF, tipo strin;  private porque só podemos acessar nesta classe
    private String email; // váriavel email; tipo string; private porque só podemos acessar nesta classe

    // Métodos (Getters e Setters)
    public String getNome() { // public: podemos acessar esse método em qualquer parte do código; get: busque os dados obtidos na variável nome
        return nome; // retorne o nome
    }

    public void setNome(String nome) { // public: podemos acessar esse método em qualquer parte do código; set: defina ou atualiza o valor de um atributo
        this.nome = nome; // indica que está atribuindo o valor do parâmetro nome ao atributo nome
    }

    public String getCpf() { // public: podemos acessar esse método em qualquer parte do código; get: busque os dados obtidos na variável cpf
        return cpf; // retorne o cpf
    }

    public void setCpf(String cpf) { // public: podemos acessar esse método em qualquer parte do código; set: defina ou atualiza o valor de um atributo
        this.cpf = cpf; // indica que está atribuindo o valor do parâmetro cpf ao atributo cpf
    }

    public String getEmail() { // public: podemos acessar esse método em qualquer parte do código; get: busque os dados obtidos na variável email
        return email; // retorne o email
    }

    public void setEmail(String email) { // public: podemos acessar esse método em qualquer parte do código; set: defina ou atualiza o valor de um atributo
        this.email = email; // indica que está atribuindo o valor do parâmetro email ao atributo email 
    }
}