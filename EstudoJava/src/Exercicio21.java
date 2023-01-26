import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor da casa: ");
        double valorCasa = scan.nextDouble();

        System.out.print("Informe seu salário: ");
        double salario = scan.nextDouble();

        System.out.print("Informe quantos anos? ");
        double anos = scan.nextDouble();

        double prestacao = valorCasa / (anos * 12);
        double minino = salario * 30 / 100;
        
        System.out.printf("Para pagar uma casa de R$%.2f em %d anos%n", valorCasa, (int)Math.floor(anos));
        System.out.printf("a prestação será de R$%.2f%n", prestacao);

        if(prestacao <= minino){
            System.out.print("Empréstimo pode ser CONCEDIDO!%n");
        }else{
            System.out.print("Empréstimo NEGADO!");
        }
       
        scan.close();
    }
}