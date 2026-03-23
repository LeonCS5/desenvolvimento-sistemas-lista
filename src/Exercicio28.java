import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        // Leia três valores e apresente a soma dos quadrados deles.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite 3 valores: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        System.out.println("Soma dos quadrados: " + ((a*a)+(b*b)+(c*c)));
        
        sc.close();
    }
}
