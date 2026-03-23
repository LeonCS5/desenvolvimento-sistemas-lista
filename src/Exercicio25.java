import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        // Leia uma área em acres e converta para metros quadrados.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Acres: ");
double a = sc.nextDouble();
System.out.println("Metros quadrados: " + (a * 4048.58));
        
        sc.close();
    }
}
