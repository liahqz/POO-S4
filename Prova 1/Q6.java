import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Me diga um número inteiro.");
    int num = scanner.nextInt();
    
    int sucs = num+1;
    int ante = num-1;

    System.out.println("O sucessor é:" + sucs + ", e o antecessor é:" + ante + ".");
    }
}

