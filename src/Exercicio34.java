import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        // Leia o raio de um círculo e calcule sua área.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Raio: ");
        double r = sc.nextDouble();
        System.out.println("Area: " + (3.141592 * r * r));
        
        sc.close();
    }
}
