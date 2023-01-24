import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {

        double co, ca, hi;

        Scanner scan = new Scanner (System.in);

        System.out.print("Informe o cateto oposto: ");
        co = scan.nextDouble();

        System.out.print("Informe o cateto adjacente: ");
        ca = scan.nextDouble();

        hi = Math.hypot(co, ca);

        System.out.printf("A hipotenusa vai media %.2f", hi);

        scan.close();
    }
}
