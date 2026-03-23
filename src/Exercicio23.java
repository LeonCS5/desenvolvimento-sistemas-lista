import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        // Leia um comprimento em metros e converta para jardas.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Metros: ");
        double m = sc.nextDouble();
        System.out.println("Jardas: " + (m / 0.91));
        
        sc.close();
    }
}
