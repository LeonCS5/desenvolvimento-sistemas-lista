import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // Leia uma velocidade em km/h e apresente-a convertida em m/s.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Velocidade (km/h): ");
double k = sc.nextDouble();
System.out.println("m/s: " + (k / 3.6));
        
        sc.close();
    }
}
