import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        double c,f;
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a temperatuta em C: ");
        c = scan.nextDouble();

        f = ((9 * c) / 5) + 32;

        System.out.printf("A temperatura de %.2f C corresponde a %.2f F", c, f);

        scan.close();
    }
}
