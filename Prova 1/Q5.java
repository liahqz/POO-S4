import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    float sm = 788;

    System.out.println("Quanto você recebe?");
    float su = scanner.nextFloat();

    float quantsm = su/sm;

    System.out.println("A quantidade de salários mínimos que você recebe é:" + quantsm + ".");
}
}