import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        // Leia um valor de comprimento em polegadas e apresente-o convertido em centímetros.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Polegadas: ");
        double p = sc.nextDouble();
        System.out.println("Centimetros: " + (p * 2.54));
        
        sc.close();
    }
}
