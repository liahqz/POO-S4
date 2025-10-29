public class testePolimorfismo{
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        meuCachorro.fazerSom();
        meuGato.fazerSom();
    }
}