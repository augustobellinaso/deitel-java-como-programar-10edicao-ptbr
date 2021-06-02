package capitulo6.exercicios.exercicio17;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class ParImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um inteiro ou -1 para sair: ");
        int number = sc.nextInt();

        while (number != -1) {
            System.out.printf("%d é %s%n", number, (isEven(number) ? "par" : "ímpar"));

            System.out.print("Digite um inteiro ou -1 para sair: ");
            number = sc.nextInt();
        }

    }


    public static boolean isEven(int number) {
        return (number % 2 == 0);

    }
}
