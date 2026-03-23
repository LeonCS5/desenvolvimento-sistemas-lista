import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        // Leia um número de 4 dígitos e imprima um dígito por linha.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Num de 4 digitos: ");
String n = sc.next();
System.out.println(n.charAt(0)+"\n        "+n.charAt(1)+"\n        "+n.charAt(2)+"\n        "+n.charAt(3));
        
        sc.close();
    }
}
