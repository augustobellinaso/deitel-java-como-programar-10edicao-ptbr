package capitulo6.exercicios.exercicio27;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class MDC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um inteiro: ");
        int a = sc.nextInt();
        System.out.printf("Digite um inteiro: ");
        int b = sc.nextInt();

        System.out.printf("O MDC de %d e %d é: %d%n", a, b, mdc(a, b));
        System.out.printf("O MDC de %d e %d é: %d", a, b, mdcRecursivo(a, b));


    }

    public static int mdc(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }

    public static int mdcRecursivo(int a, int b) {
        if (b == 0) {
            return a;
        }

        return mdc(b,a % b);
    }
}
