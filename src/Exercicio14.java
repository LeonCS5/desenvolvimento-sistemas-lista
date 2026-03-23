import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        // Leia um ângulo em graus e apresente-o convertido em radianos.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Graus: ");
        double g = sc.nextDouble();
        System.out.println("Radianos: " + (g * 3.14 / 180.0));
        
        sc.close();
    }
}
