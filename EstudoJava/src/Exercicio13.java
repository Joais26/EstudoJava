import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        int quantidadeKm, quantidadeDias;

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a quantidade de Km percorrido: ");
        quantidadeKm = scan.nextInt();

        System.out.print("Informe a quantidade de Dias: ");
        quantidadeDias = scan.nextInt();

        double total;

        total = (quantidadeDias * 60) + (quantidadeKm * 0.15);

        System.out.printf("você percorreu com o veiculo %d Km por %d dias%nno total de R$%.2f%n", quantidadeKm, quantidadeDias, total);

        scan.close();
        
    }
}
