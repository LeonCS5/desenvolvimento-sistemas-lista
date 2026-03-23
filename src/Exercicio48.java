import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        // Converta segundos em horas, minutos e segundos.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Segundos totais: ");
        int s = sc.nextInt();
        System.out.println((s/3600) + "h " + ((s%3600)/60) + "m " + (s%60) + "s");
        
        sc.close();
    }
}
