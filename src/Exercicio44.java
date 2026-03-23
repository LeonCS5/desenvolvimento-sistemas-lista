import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        // Calcule quantos degraus são necessários para atingir uma altura desejada.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Altura do degrau e Altura desejada: ");
        double degrau = sc.nextDouble(), altura = sc.nextDouble();
        System.out.println("Degraus necessarios: " + Math.ceil(altura / degrau));
        
        sc.close();
    }
}
