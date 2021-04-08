package capitulo2.exercicio15;

import java.util.Scanner;

/**
 * @author Augusto Loose Bellinaso
 */
public class Exercicio15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();

        System.out.println("SOMA: " + (num1 + num2));

        System.out.println("PRODUTO: " + (num1 * num2));

        System.out.println("DIFERENÇA: " + (num1 - num2));

        System.out.println("QUOCIENTE: " + (num1 / num2));
    }
}
