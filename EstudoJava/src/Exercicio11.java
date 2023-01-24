import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        double salario, novoSalario;

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe seu salário: ");
        salario = scan.nextDouble();

        novoSalario = salario + (salario * 15 / 100);

        System.out.printf("Seu sala de %.2f foi para %.2f", salario, novoSalario);

        scan.close();
    }
}
