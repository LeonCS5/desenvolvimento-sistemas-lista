import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        // Leia um valor em reais e a cotação do dólar. Imprima o valor em dólares.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Reais e Cotacao: ");
        double reais = sc.nextDouble(), cotacao = sc.nextDouble();
        System.out.println("Dolares: " + (reais / cotacao));
        
        sc.close();
    }
}
