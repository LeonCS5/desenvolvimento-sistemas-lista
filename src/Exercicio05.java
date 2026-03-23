import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        // Leia um número real e imprima a quinta parte desse número.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
double n = sc.nextDouble();
System.out.println("Quinta parte: " + (n / 5.0));
        
        sc.close();
    }
}
