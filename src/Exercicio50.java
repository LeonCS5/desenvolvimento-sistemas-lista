import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        // Calcule o ano de nascimento com base na idade e no ano atual.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Idade e Ano Atual: ");
        int i = sc.nextInt(), a = sc.nextInt();
        System.out.println("Nascimento: " + (a - i));
        
        sc.close();
    }
}
