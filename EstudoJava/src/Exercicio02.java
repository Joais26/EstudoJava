import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        int n1, n2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        n1 = scan.nextInt();

        System.out.print("Digite o segundo numero: ");
        n2 = scan.nextInt();

        int soma = n1 + n2;

        System.out.printf("A soma de %d + %d é %d%n", n1, n2, soma);

        scan.close();
    }
}
