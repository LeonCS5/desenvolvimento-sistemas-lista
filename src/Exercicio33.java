import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        // Leia o lado de um quadrado e calcule sua área.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Lado do quadrado: ");
        double lado = sc.nextDouble();
        System.out.println("Area: " + (lado * lado));
        
        sc.close();
    }
}
