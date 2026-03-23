import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        // Um encanador recebe R$ 30,00/dia. Calcule o salário líquido com desconto de 8%.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dias trabalhados: ");
        int dias = sc.nextInt();
        System.out.println("Liquido: " + (dias * 30 * 0.92));
        
        sc.close();
    }
}
