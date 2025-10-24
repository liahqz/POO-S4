public class Coordenador {
    private String nome;            // atributos definidos como privados, para que os métodos possam manipular os dados
    private int matricula;
    private String CursoCoordenador;

    public Coordenador(String nome, int matricula, String CursoCoordenador){      // método construtor
        this.nome = nome;
        this.matricula = matricula;
        this.CursoCoordenador = CursoCoordenador;
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
    }

    public String getCursoCoodernador(){
        return CursoCoordenador;
    }

    public void setCursoCoodernador(String CursoCoodernador){
        this.CursoCoordenador = CursoCoordenador;
    }                                               // métodos - fim
}