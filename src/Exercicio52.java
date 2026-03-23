import java.util.Scanner;

public class Exercicio52 {
    public static void main(String[] args) {
        // Divida um prêmio proporcionalmente ao valor apostado por três amigos.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Apostas dos 3 amigos e Premio: ");
        double a1 = sc.nextDouble(), a2 = sc.nextDouble(), a3 = sc.nextDouble(), p = sc.nextDouble();
        double tot = a1+a2+a3;
        System.out.println("A1: " + (p*(a1/tot)) + " | A2: " + (p*(a2/tot)) + " | A3: " + (p*(a3/tot)));
        
        sc.close();
    }
}
