import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        // Leia uma massa em quilogramas e converta para libras.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Kg: ");
        double k = sc.nextDouble();
        System.out.println("Libras: " + (k / 0.45));
        
        sc.close();
    }
}
