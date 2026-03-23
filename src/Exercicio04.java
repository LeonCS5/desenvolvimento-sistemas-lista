import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        // Leia um número real e imprima o resultado do quadrado desse número.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        double n = sc.nextDouble();
        System.out.println("Quadrado: " + (n * n));
        
        sc.close();
    }
}
