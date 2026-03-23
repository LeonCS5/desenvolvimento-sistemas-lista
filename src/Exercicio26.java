import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        // Leia uma área em metros quadrados e converta para hectares.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Metros quadrados: ");
double m = sc.nextDouble();
System.out.println("Hectares: " + (m * 0.0001));
        
        sc.close();
    }
}
