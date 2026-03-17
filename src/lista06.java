
import java.util.Scanner;

// Exercício 06 (VI)
// Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit. Fórmula: F = C × (9.0/5.0) + 32.0

public class lista06 {
    public static void main(String[] args) {
        System.out.print("Digite uuma temperatura em graus Celsius: ");

        Scanner sc = new Scanner(System.in);
        double c = sc.nextInt();

        double f = c * (9.0/5.0) + 32.0;

    }
}
