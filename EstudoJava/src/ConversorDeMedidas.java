import java.util.Scanner;

public class ConversorDeMedidas {
    public static void main(String[] args) {
        
        double medida, cm, mm;

        Scanner scan = new Scanner (System.in);

        System.out.print("Uma distância em metros: ");
        medida = scan.nextDouble();

        cm = medida * 100;
        mm = medida * 1000;

        System.out.printf("A medida de %.0fm corresponde a %.0fcm e %.0fmm", medida, cm, mm);

        scan.close();
    }
}
