import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        // Leia o salário e calcule o novo salário com aumento de 25%.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Salario: ");
        double s = sc.nextDouble();
        System.out.println("Novo salario: " + (s * 1.25));
        
        sc.close();
    }
}
