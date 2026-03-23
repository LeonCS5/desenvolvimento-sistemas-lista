import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        // Leia uma velocidade em m/s e apresente-a convertida em km/h.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Velocidade (m/s): ");
double m = sc.nextDouble();
System.out.println("km/h: " + (m * 3.6));
        
        sc.close();
    }
}
