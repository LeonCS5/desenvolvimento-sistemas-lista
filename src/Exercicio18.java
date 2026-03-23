import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        // Leia um volume em metros cúbicos (m3) e converta para litros.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Metros cubicos: ");
        double m = sc.nextDouble();
        System.out.println("Litros: " + (1000 * m));
        
        sc.close();
    }
}
