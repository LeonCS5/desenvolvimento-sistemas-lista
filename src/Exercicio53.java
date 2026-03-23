import java.util.Scanner;

public class Exercicio53 {
    public static void main(String[] args) {
        // Calcule o custo para cercar um terreno.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Comp, Largura e Preco do metro: ");
        double c = sc.nextDouble(), l = sc.nextDouble(), p = sc.nextDouble();
        System.out.println("Custo total: " + (2 * (c + l) * p));
        
        sc.close();
    }
}
