import java.util.Random;
import java.util.Scanner;

public class Exercicio17 {
    /**
     * @param args
     */
    public static void main(String[] args) {

       
       Scanner scan = new Scanner (System.in);
       
       Random random = new Random();
       int computador = random.nextInt(5+1);  
       
        System.out.print("\t\t\t*** Vamos adivinhar um numero\n");
        System.out.print("Pense em um numero inteiro entre 0 a 5\n");
        System.out.print("Agora digite o numero: ");
       int jogador = scan.nextInt();

        if(jogador != computador){
            System.out.printf("Você PERDEU! pensei no %d%n", computador);
        }else{
            System.out.println("PARABENS! você ganhou");
        }

        scan.close();
    }    
}
