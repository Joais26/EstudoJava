import java.util.Scanner;
public class Exercicio19{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\t\t\tPar ou Impar");

        System.out.print("O que você escolhe: ");
        int jogador = scan.nextInt();

        int resultado = jogador % 2;
        if(resultado == 0){
            System.out.printf("O número %d é PAR%n", jogador);
        }else{
            System.out.printf("O número %d é IMPAR%n", jogador);
        }
        
        scan.close();
    }
}