import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        // Leia um ângulo em radianos e apresente-o convertido em graus.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Radianos: ");
double r = sc.nextDouble();
System.out.println("Graus: " + (r * 180.0 / 3.14));
        
        sc.close();
    }
}
