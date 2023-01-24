import java.util.Scanner;

public class Exercicio14 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        double num;

        Scanner scan = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        num = scan.nextDouble();

        System.out.printf("O valor informado foi %.2f a porção inteira é %d", num,(int) Math.floor(num));

        scan.close();
    }
}
