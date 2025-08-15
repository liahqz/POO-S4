import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto custa o IPI?");
        Float ipi = scanner.nextFloat();

        System.out.println("Quanto custa o valor da peça 1?");
        Float valor1 = scanner.nextFloat();
        
        System.out.println("Qual a quantidade peças 1 você vai levar?");
        Float quant1 = scanner.nextFloat();

        System.out.println("Quanto custa o valor da peça 2?");
        Float valor2 = scanner.nextFloat();

        System.out.println("Qual a quantidade peças 2 você vai levar?");
        Float quant2 = scanner.nextFloat();

        float total = (valor1*quant1 + valor2*quant2)*(ipi/100 + 1); 

        System.out.println("O total da compra é:" + total + ".");
    }
}

