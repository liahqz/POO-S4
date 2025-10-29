public class Cachorro extends Animal{

    @Override              // para alguns atores, ele é uma anotação que informa ao compilador que vai ocorrer uma sobrescrita de um método. O Override é um tipo especial de metadado usado no código. Serve para segurança e legibilidade.
    public void fazerSom(){
        System.out.println("O cachorro: au au");
    }

}