import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        // Leia quatro notas, calcule a média aritmética e imprima o resultado.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite as 4 notas: ");
        double n1 = sc.nextDouble(), n2 = sc.nextDouble(), n3 = sc.nextDouble(), n4 = sc.nextDouble();
        System.out.println("Media: " + ((n1+n2+n3+n4)/4));
        
        sc.close();
    }
}
