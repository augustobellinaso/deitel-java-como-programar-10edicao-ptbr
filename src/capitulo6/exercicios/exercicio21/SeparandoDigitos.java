package capitulo6.exercicios.exercicio21;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class SeparandoDigitos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um número entre 1 e 99999: ");
        int numero = sc.nextInt();

        displayDigits(numero);

    }

    public static int obterQuociente(int a, int b) {
        return a / b;
    }

    public static int obterResto(int a, int b) {
        return a % b;
    }

    public static void displayDigits(int number) {

        if (number >= 1 && number < 10) {
            System.out.printf("%d", obterResto(number, 10));
        }

        if (number >= 10 && number < 100) {
            System.out.printf("%d %d", obterQuociente(number, 10), obterResto(number, 10));
        }

        if (number >= 100 && number < 1000) {
            System.out.printf("%d %d %d", obterQuociente(number, 100), obterQuociente(obterResto(number, 100), 10), obterResto(obterResto(number, 100), 10));
        }

        if (number >= 1000 && number < 10000) {
            System.out.printf("%d %d %d %d", obterQuociente(number, 1000), obterQuociente(obterResto(number, 1000), 100), obterQuociente(obterResto(number, 100), 10), obterResto(number, 10));
        }

        if (number >= 10000 && number <= 99999) {
            System.out.printf("%d %d %d %d %d", obterQuociente(number, 10000), obterQuociente(obterResto(number, 10000), 1000), obterQuociente(obterResto(number, 1000), 100), obterQuociente(obterResto(number, 100), 10), obterResto(number, 10));
        }
    }
}
