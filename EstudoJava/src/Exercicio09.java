import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        double largura, altura, area;
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe sua largura: ");
        largura = scan.nextDouble();

        System.out.print("Informe sua altura: ");
        altura = scan.nextDouble();

        area = largura * altura;

        int quantidadeDeTinta;

        quantidadeDeTinta = (int) (area / 2);

        System.out.printf("Sua parede tem uma dimensão de %.2fm de largura e %.2fm de altura medido no total %.2fm²%n", largura, altura, area);

        System.out.printf("com uma area de %.2fm² sera necessario %d litros de tinta para pinta uma area de %.2fm²", area, quantidadeDeTinta, area);

        scan.close();
    }
}
