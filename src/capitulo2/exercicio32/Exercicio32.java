package capitulo2.exercicio32;

import java.util.Scanner;

/**
 * @author Augusto Loose Bellinaso
 */
public class Exercicio32 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = input.nextInt();
        System.out.print("Digite o quarto número: ");
        int num4 = input.nextInt();
        System.out.print("Digite o quinto número: ");
        int num5 = input.nextInt();

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        if (num1 > 0) {
            positivos++;
        }

        if (num1 < 0) {
            negativos++;
        }

        if (num1 == 0) {
            zeros++;
        }

        if (num2 > 0) {
            positivos++;
        }

        if (num2 < 0) {
            negativos++;
        }

        if (num2 == 0) {
            zeros++;
        }

        if (num3 > 0) {
            positivos++;
        }

        if (num3 < 0) {
            negativos++;
        }

        if (num3 == 0) {
            zeros++;
        }

        if (num4 > 0) {
            positivos++;
        }

        if (num4 < 0) {
            negativos++;
        }

        if (num4 == 0) {
            zeros++;
        }

        if (num5 > 0) {
            positivos++;
        }

        if (num5 < 0) {
            negativos++;
        }

        if (num5 == 0) {
            zeros++;
        }

        System.out.printf("Números positivos: %d%n", positivos);
        System.out.printf("Números negativos: %d%n", negativos);
        System.out.printf("Números zeros: %d%n", zeros);
    }
}
