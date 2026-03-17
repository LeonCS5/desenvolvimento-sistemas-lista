// Exercício 03 (III)
// Peça ao usuário para digitar três valores inteiros e imprima a soma deles.

import java.util.Scanner;

public class lista03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int b = sc.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int c = sc.nextInt();

        int soma = a + b + c;

        System.out.println("Soma: " + soma);

        sc.close();
    }
}