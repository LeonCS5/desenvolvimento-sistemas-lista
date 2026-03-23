import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        // Leia o salário-base. Gratificação: +5%. Imposto: -7%.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Salario base: ");
double sb = sc.nextDouble();
System.out.println("Receber: " + (sb + (sb*0.05) - (sb*0.07)));
        
        sc.close();
    }
}
