import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        // Converta uma letra maiúscula para minúscula usando ASCII.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Letra maiuscula: ");
char l = sc.next().charAt(0);
System.out.println("Minuscula: " + (char)(l + 32));
        
        sc.close();
    }
}
