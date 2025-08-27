import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        float a;
        float b;
        
        a = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor:"));
        b = Float.parseFloat(JOptionPane.showInputDialog("Digite outro valor:"));

        JOptionPane.showMessageDialog(null, "O valor das equações são:\n Soma: " + (a+b) + "\n Subtração: " + (a-b) + "\n Multiplicação: " + (a*b) + "\n Divisão: " + (a/b), null, 0);
    }
    
}
