import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        // Leia uma temperatura em graus Celsius e apresente-a convertida em graus Kelvin.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Temp Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Kelvin: " + (c + 273.15));
        
        sc.close();
    }
}
