import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // Leia um número inteiro e o imprima.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um inteiro: ");
int n = sc.nextInt();
System.out.println("Resultado: " + n);
        
        sc.close();
    }
}
