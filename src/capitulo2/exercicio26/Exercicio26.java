package capitulo2.exercicio26;

import java.util.Scanner;

/**
 * @author Augusto Loose Bellinaso
 */
public class Exercicio26 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " é um múltiplo de " + num2);
        }
    }
}
