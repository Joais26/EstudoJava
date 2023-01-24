import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args) {

        double angulo, seno, cosseno, tangente;

        Scanner scan = new Scanner (System.in);

        System.out.print("Digite o ângulo que você deseja: ");
        angulo = scan.nextDouble();

        seno = Math.sin(Math.toRadians(angulo));       
        cosseno = Math.cos(Math.toRadians(angulo));    
        tangente = Math.tan(Math.toRadians(angulo));

        System.out.printf("O ângulo de %.2f tem o SENO de %.2f%n", angulo, seno);
        System.out.printf("O ângulo de %.2f tem o COSSENO de %.2f%n", angulo, cosseno);
        System.out.printf("O ângulo de %.2f tem o TANGENTE de %.2f%n", angulo, tangente);      
    
        scan.close();
    }
}
