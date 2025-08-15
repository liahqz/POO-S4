import java.util.Scanner;

public class Q1{

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
        int idadeemdias;

        System.out.println("Quantos anos você tem?");
        int anos = scanner.nextInt();
        int vfa = anos*365;

        System.out.println("Quantos meses você tem?");
        int meses = scanner.nextInt();
        int vfm = meses*30;

        System.out.println("Quantos dias você tem?");
        int dias = scanner.nextInt();

        System.out.println("Sua idade em dias é:" + idadeemdias + ".");
    }
}
