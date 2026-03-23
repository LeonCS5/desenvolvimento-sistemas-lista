import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        // Leia valor da hora e horas trabalhadas. Adicione 10% ao salário final.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Valor hora e Horas trab: ");
double vh = sc.nextDouble(), ht = sc.nextDouble();
System.out.println("Salario com 10%: " + ((vh * ht) * 1.10));
        
        sc.close();
    }
}
