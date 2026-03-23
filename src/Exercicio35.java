import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        // Leia os catetos (a e b) de um triângulo e calcule a hipotenusa.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Catetos a e b: ");
double a = sc.nextDouble(), b = sc.nextDouble();
System.out.println("Hipotenusa: " + Math.sqrt((a*a)+(b*b)));
        
        sc.close();
    }
}
