import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws Exception {

        String nome;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = scan.nextLine();        
        System.out.printf("É um prazer em te conhece %s%n", nome);

        scan.close();
    }
}
