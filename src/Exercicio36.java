import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        // Leia altura e raio de um cilindro e calcule seu volume.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Altura e Raio: ");
        double h = sc.nextDouble(), r = sc.nextDouble();
        System.out.println("Volume: " + (3.141592 * r * r * h));
        
        sc.close();
    }
}
