import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        // Leia um número inteiro e imprima a soma do sucessor do triplo com o antecessor do dobro.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um inteiro: ");
        int n = sc.nextInt();
        int sucTriplo = (n * 3) + 1;
        int antDobro = (n * 2) - 1;
        System.out.println("Resultado: " + (sucTriplo + antDobro));
        
        sc.close();
    }
}
