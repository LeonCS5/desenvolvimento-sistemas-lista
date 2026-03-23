import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        // Leia um número de 3 dígitos e imprima-o invertido.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Num de 3 digitos: ");
int n = sc.nextInt();
System.out.println("Invertido: " + ((n%10)*100 + ((n/10)%10)*10 + (n/100)));
        
        sc.close();
    }
}
