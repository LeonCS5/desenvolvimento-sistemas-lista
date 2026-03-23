import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        // Leia uma distância em quilômetros e apresente-a convertida em milhas.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quilometros: ");
double k = sc.nextDouble();
System.out.println("Milhas: " + (k / 1.61));
        
        sc.close();
    }
}
