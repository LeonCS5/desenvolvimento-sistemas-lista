import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        // Leia uma área em hectares e converta para metros quadrados.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Hectares: ");
        double h = sc.nextDouble();
        System.out.println("Metros quadrados: " + (h * 10000));
        
        sc.close();
    }
}
