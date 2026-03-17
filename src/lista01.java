// Exercício 01 (I)
// Faça um programa que leia um número inteiro e o imprima.

import java.util.Scanner;

public class lista01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        System.out.println("Número digitado: " + numero);

        sc.close();
    }
}
