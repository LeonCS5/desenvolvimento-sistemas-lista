import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        // Leia um valor de comprimento em centímetros e apresente-o convertido em polegadas.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Centimetros: ");
        double c = sc.nextDouble();
        System.out.println("Polegadas: " + (c / 2.54));
        
        sc.close();
    }
}
