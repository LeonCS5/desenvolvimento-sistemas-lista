import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        // Vendas com desconto, parcelamento e comissão.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Valor da venda: ");
        double v = sc.nextDouble();
        System.out.println("A vista: " + (v*0.9) + "\n        Parc(3x): " + (v/3) + "\n        Comis. vista: " + ((v*0.9)*0.05) + "\n        Comis. parc: " + (v*0.05));
        
        sc.close();
    }
}
