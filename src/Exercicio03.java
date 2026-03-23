import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        // Peça ao usuário para digitar três valores inteiros e imprima a soma deles.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite 3 inteiros: ");
int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
System.out.println("Soma: " + (a + b + c));
        
        sc.close();
    }
}
