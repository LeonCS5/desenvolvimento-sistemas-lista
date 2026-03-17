// Exercício 05 (V)
// Leia um número real e imprima a quinta parte desse número.

import java.util.Scanner;

public class lista05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double numero = sc.nextDouble();

        double quintaParte = numero / 5;

        System.out.println("Quinta parte: " + quintaParte);

        sc.close();
    }
}