package capitulo2.exercicio24;

import java.util.Scanner;

/**
 * @author Augusto Loose Bellinaso
 */
public class Exercicio24 {

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

        //verificando o maior
        if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5) {
            System.out.println("Maior numero: " + num1);
        } else if (num2 >= num1 && num2 >= num3 && num2 >= num4 && num2 >= num5) {
            System.out.println("Maior numero: " + num2);
        } else if (num3 >= num2 && num3 >= num2 && num3 >= num4 && num3 >= num5) {
            System.out.println("Maior numero: " + num3);
        } else if (num4 >= num2 && num4 >= num3 && num4 >= num1 && num4 >= num5) {
            System.out.println("Maior numero: " + num4);
        } else if (num5 >= num2 && num5 >= num3 && num5 >= num4 && num5 >= num1) {
            System.out.println("Maior numero: " + num5);
        }

        //verificando o menor
        if (num1 <= num2 && num1 <= num3 && num1 <= num4 && num1 <= num5) {
            System.out.println("Menor numero: " + num1);
        } else if (num2 <= num1 && num2 <= num3 && num2 <= num4 && num2 <= num5) {
            System.out.println("Menor numero: " + num2);
        } else if (num3 <= num2 && num3 <= num2 && num3 <= num4 && num3 <= num5) {
            System.out.println("Menor numero: " + num3);
        } else if (num4 <= num2 && num4 <= num3 && num4 <= num1 && num4 <= num5) {
            System.out.println("Menor numero: " + num4);
        } else if (num5 <= num2 && num5 <= num3 && num5 <= num4 && num5 <= num1) {
            System.out.println("Menor numero: " + num5);
        }
    }
}
