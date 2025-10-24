
public class Funcionario {
    private String nome;            // atributos definidos como privados, para que os métodos possam manipular os dados
    private int matricula;
    private String departamento;

    public Funcionario(String nome, int matricula, String departamento){      // método construtor
        this.nome = nome;
        this.matricula = matricula;
        this.departamento = departamento;
    }

    public int getMatricula(){                       // métodos - ínicio, devem ser usados get e set
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
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }                                               // métodos - fim
}