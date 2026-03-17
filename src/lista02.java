// Exercício 02 (II)
// Faça um programa que leia um número real e o imprima.

import java.util.Scanner;

public class lista02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double numero = sc.nextDouble();

        System.out.println("Número digitado: " + numero);

        sc.close();
    }
}
