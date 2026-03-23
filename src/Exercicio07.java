import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        // Leia uma temperatura em graus Fahrenheit e apresente-a convertida em Celsius.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Temp Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("Celsius: " + (5.0 * (f - 32.0) / 9.0));
        
        sc.close();
    }
}
