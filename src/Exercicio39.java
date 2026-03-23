import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        // Divida R$ 780.000,00 entre três ganhadores (46%, 32%, restante).
        Scanner sc = new Scanner(System.in);
        
        double premio = 780000;
System.out.println("1o: " + (premio*0.46) + "\n        2o: " + (premio*0.32) + "\n        3o: " + (premio*0.22));
        
        sc.close();
    }
}
