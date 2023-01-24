import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        double preco, novoPreco;

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o preco do produto: ");
        preco = scan.nextDouble();

        novoPreco = preco - (preco * 5 /100);

        System.out.printf("Produto que custava R$%.2f ganhou um desconto que foi para R$%.2f", preco, novoPreco);

        scan.close();
    }
}
