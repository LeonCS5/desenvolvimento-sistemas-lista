import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        // Leia um número inteiro e imprima seu antecessor e sucessor.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um inteiro: ");
        int n = sc.nextInt();
        System.out.println("Antecessor: " + (n-1) + " | Sucessor: " + (n+1));
        
        sc.close();
    }
}
