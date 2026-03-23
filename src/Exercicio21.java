import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        // Leia uma massa em libras e converta para quilogramas.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Libras: ");
double l = sc.nextDouble();
System.out.println("Kg: " + (l * 0.45));
        
        sc.close();
    }
}
