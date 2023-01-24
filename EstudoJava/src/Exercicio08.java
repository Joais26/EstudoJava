import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        double real, dolar;

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe quando de dinheiro você tem na carteira RS: ");
        real = scan.nextDouble();

        dolar = real / 5.15;

        System.out.printf("com R$ %.2f da pra compra US$% .2f dolar%n", real, dolar);

        scan.close();
    }
}
