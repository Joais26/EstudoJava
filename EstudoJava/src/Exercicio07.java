import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        int numero;
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número: ");
        numero = scan.nextInt();

        System.out.printf("%d x %d = %d%n", numero, 1, (numero*1));
        System.out.printf("%d x %d = %d%n", numero, 2, (numero*2));
        System.out.printf("%d x %d = %d%n", numero, 3, (numero*3));
        System.out.printf("%d x %d = %d%n", numero, 4, (numero*4));
        System.out.printf("%d x %d = %d%n", numero, 5, (numero*5));
        System.out.printf("%d x %d = %d%n", numero, 6, (numero*6));
        System.out.printf("%d x %d = %d%n", numero, 7, (numero*7));
        System.out.printf("%d x %d = %d%n", numero, 8, (numero*8));
        System.out.printf("%d x %d = %d%n", numero, 9, (numero*9));
        System.out.printf("%d x %d = %d%n", numero, 10, (numero*10));

        scan.close();
    }
}
