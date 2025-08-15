import java.util.Scanner;

public class Q3 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);   

       System.out.println("Me informe seu saldo.");
       float saldo = scanner.nextFloat();
       double saldop = 0.01 * saldo;
       double saldof = saldo+saldop;

       System.out.println("Seu saldo com reajuste é:" + saldof + ".");
   } 
}
