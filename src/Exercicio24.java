import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        // Leia uma área em metros quadrados e converta para acres.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Metros quadrados: ");
double m = sc.nextDouble();
System.out.println("Acres: " + (m * 0.000247));
        
        sc.close();
    }
}
