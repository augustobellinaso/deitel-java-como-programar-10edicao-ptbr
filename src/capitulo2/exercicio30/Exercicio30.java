package capitulo2.exercicio30;

import java.util.Scanner;

/**
 * @author Augusto Loose Bellinaso
 */
public class Exercicio30 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número com 5 dígitos: ");
        int num = input.nextInt();

        int d1 = num / 10000;
        num %= 10000;
        int d2 = num / 1000;
        num %= 1000;
        int d3 = num / 100;
        num %= 100;
        int d4 = num / 10;
        int d5 = num % 10;

        System.out.printf("%d %d %d %d %d", d1, d2, d3, d4, d5);

    }
}
