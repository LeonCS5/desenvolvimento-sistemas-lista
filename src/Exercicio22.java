import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        // Leia um comprimento em jardas e converta para metros.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Jardas: ");
        double j = sc.nextDouble();
        System.out.println("Metros: " + (0.91 * j));
        
        sc.close();
    }
}
