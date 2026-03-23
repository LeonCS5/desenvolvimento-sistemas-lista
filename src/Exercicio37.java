import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        // Leia o valor de um produto e aplique 12% de desconto.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Valor do produto: ");
        double v = sc.nextDouble();
        System.out.println("Com desconto: " + (v * 0.88));
        
        sc.close();
    }
}
