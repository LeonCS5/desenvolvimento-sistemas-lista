// Exercício 04 (IV)
// Leia um número real e imprima o resultado do quadrado desse número.

import java.util.Scanner;

public class lista04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double numero = sc.nextDouble();

        double quadrado = numero * numero;

        System.out.println("Quadrado: " + quadrado);

        sc.close();
    }
}
