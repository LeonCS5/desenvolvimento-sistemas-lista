import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        // Leia um volume em litros e converta para metros cúbicos.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Litros: ");
double l = sc.nextDouble();
System.out.println("Metros cubicos: " + (l / 1000.0));
        
        sc.close();
    }
}
