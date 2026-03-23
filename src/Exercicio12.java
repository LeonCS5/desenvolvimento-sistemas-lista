import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        // Leia uma distância em milhas e apresente-a convertida em quilômetros.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Milhas: ");
double m = sc.nextDouble();
System.out.println("Km: " + (1.61 * m));
        
        sc.close();
    }
}
