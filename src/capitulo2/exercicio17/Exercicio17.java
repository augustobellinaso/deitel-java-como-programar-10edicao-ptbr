package capitulo2.exercicio17;

import java.util.Scanner;

/**
 * @author Augusto Loose Belliaso
 */
public class Exercicio17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = input.nextInt();

        int soma = num1 + num2 + num3;
        System.out.println("SOMA: " + soma);

        System.out.println("MÉDIA: " + (soma / 3));

        System.out.println("PRODUTO: " + (num1 * num2 * num3));

        //Verificando os maiores
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Maior número: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Maior número: " + num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println("Maior número: " + num3);
        }

        //Verificando o menor númerp
        if (num1 <= num2 && num1 <= num3) {
            System.out.println("Menor número: " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("Menor número: " + num2);
        } else if (num3 <= num1 && num3 <= num2) {
            System.out.println("Menor número: " + num3);
        }
    }
}
