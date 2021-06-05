package capitulo6.exercicios.exercicio23;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class LocalizarMinimo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.printf("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.printf("Digite o terceiro número: ");
        double num3 = sc.nextDouble();

        System.out.printf("O menor número é: %f", minimum3(num1, num2, num3));
    }

    public static double minimum3(double x, double y, double z) {
        return Math.min(x, Math.min(y, z));
    }
}
