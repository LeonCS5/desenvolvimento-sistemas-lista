import java.util.Scanner;

public class Exercicio51 {
    public static void main(String[] args) {
        // Leia coordenadas (x, y) e calcule a distância até (0, 0).
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Coordenadas X e Y: ");
double x = sc.nextDouble(), y = sc.nextDouble();
System.out.println("Distancia ate 0,0: " + Math.sqrt((x*x)+(y*y)));
        
        sc.close();
    }
}
