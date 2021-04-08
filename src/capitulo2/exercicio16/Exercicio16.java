package capitulo2.exercicio16;

import java.util.Scanner;

/**
 * @author Augusto Loose Bellinaso
 */
public class Exercicio16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.printf("%d is larger!", num1);
        } else if (num1 < num2) {
            System.out.printf("%d is larger!", num2);
        } else {
            System.out.println("These numbers are equal!");
        }
    }
}
