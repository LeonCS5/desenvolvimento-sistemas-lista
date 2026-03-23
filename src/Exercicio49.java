import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        // Calcule o horário final de um experimento.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("H, M, S atuais e Duracao(S): ");
int h = sc.nextInt(), m = sc.nextInt(), s = sc.nextInt(), d = sc.nextInt();
int ts = h*3600 + m*60 + s + d;
System.out.println(((ts/3600)%24) + "h " + ((ts%3600)/60) + "m " + (ts%60) + "s");
        
        sc.close();
    }
}
