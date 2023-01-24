import java.util.Scanner;

public class DobroTriploRaizQuadrada {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        int numero, dobro, triplo;
        double raizQuadrada;

        Scanner scan = new Scanner (System.in);

        System.out.print("Informe o valor: ");
        numero = scan.nextInt();

        dobro = numero * 2;
        triplo = numero * 3;
        raizQuadrada = Math.sqrt(numero);

        System.out.print("Dobro de " + numero + " é " + dobro + " \n");
        System.out.print("Triplo de " + numero + " é " + triplo + " \n");
        System.out.print("Raiz Quadrada de " + numero + " é " + raizQuadrada + " \n");

        scan.close();
    }
}
