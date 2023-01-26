import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\t\t\tCusto da Viagem\n");

        System.out.print("Informe a distância da sua viagem: ");
        int distancia = scan.nextInt();

        int km = 200;
        double viagemAte200Km = distancia * 0.50;
        double viagemMaisLongas = distancia * 0.45;

        if (distancia <= km) {
            System.out.printf("Você pagará em sua viagem de %dKm R$%d%n", distancia, (int)Math.floor(viagemAte200Km));
        } else {
            System.out.printf("Você pagará em sua viagem de %dKm R$%d%n", distancia, (int)Math.floor(viagemMaisLongas));
        }
        scan.close();
    }
}