package capitulo6.exercicios.exercicio20;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class AreaCirculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        System.out.printf("A área do círculo de raio %f é: %f%n", raio, circleArea(raio));
    }

    private static double circleArea(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }
}
