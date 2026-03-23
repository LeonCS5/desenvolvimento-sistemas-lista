import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        // Leia uma temperatura em graus Kelvin e apresente-a convertida em graus Celsius.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Temp Kelvin: ");
double k = sc.nextDouble();
System.out.println("Celsius: " + (k - 273.15));
        
        sc.close();
    }
}
