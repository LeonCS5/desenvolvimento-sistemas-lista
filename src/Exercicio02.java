import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        // Leia um número real e o imprima.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um real: ");
        double n = sc.nextDouble();
        System.out.println("Resultado: " + n);
        
        sc.close();
    }
}
