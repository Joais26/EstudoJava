import java.util.Scanner;
public class Exercicio18{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Infome sua velocidade: ");
        double velocidade = scan.nextDouble();

        double velocidadeMax = 80;
        double multa = 7;
        double totalAPagar = (velocidade - velocidadeMax) * multa;

        if (velocidade > velocidadeMax){
            System.out.print("Multado por excesso de velocidade\n");
            System.out.printf("Multa a paga R$%.2f%n", totalAPagar);
        }else{
            System.out.print("Digija com cuidado");
        }
        scan.close();
    }
}