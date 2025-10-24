public class Pessoa {
    private String nome;
    private int matricula;

    public Pessoa(String nome, int matricula){      // método construtor
        this.nome = nome;
        this.matricula = matricula;
    }

    public int getMatricula(){                      // métodos - ínicio, devem ser usados get e set
        return matricula;
    }
    
    public void setMatricula(int matricula){        // esses funcionam com o conceito de encapsulamento de dados, garantindo a proteção à manipulação de informações(atributos)
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;                        
    }                                              // métodos - fim
}
