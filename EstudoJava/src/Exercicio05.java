import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        double n1, n2;

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe sua primeira nota: ");
        n1 = scan.nextDouble();

        System.out.print("Informe sua segunda nota: ");
        n2 = scan.nextDouble();
System.out.println();
        double media;
        media = (n1 + n2) / 2;

        System.out.print("Primeira nota informada: " + n1 + " \n");
        System.out.print("Segunda nota informada: " + n2 + " \n");
System.out.println();        
        System.out.print("Sua media é: " + media + " \n");

        scan.close();
    }
}
