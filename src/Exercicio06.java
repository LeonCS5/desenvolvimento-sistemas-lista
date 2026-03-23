import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        // Leia uma temperatura em graus Celsius e apresente-a convertida em Fahrenheit.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Temp Celsius: ");
double c = sc.nextDouble();
System.out.println("Fahrenheit: " + (c * (9.0/5.0) + 32.0));
        
        sc.close();
    }
}
