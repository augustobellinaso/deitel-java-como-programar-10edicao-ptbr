package capitulo2.exercicio25;

import java.util.Scanner;

/**
 * @author Augusto Loose Bellinaso
 */
public class Exercicio25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();

        if (num % 2 == 0 ) {
            System.out.println("PAR!");
        } else {
            System.out.println("ÍMPAR");
        }
    }
}
