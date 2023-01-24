import java.util.Scanner;

public class AntecessorESucessor {
    public static void main(String[] args) {

        int numero;

        Scanner scan = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        numero = scan.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;
        System.out.printf("O antecessor de %d é %d e o seu sucessor é %d%n", numero, antecessor, sucessor);

        scan.close();
    }
}
