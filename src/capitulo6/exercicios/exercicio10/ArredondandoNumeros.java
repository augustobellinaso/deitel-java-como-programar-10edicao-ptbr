package capitulo6.exercicios.exercicio10;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class ArredondandoNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;

        System.out.print("Digite um valor ou 0 para sair: ");
        numero = sc.nextDouble();

        while (numero != 0) {
            System.out.printf("Número original: %f%n", numero);
            System.out.printf("Número arredondado pro inteiro mais próximo: %f%n", roundToInteger(numero));
            System.out.printf("Número arredondado pro décimo mais próximo: %f%n", roundToTenths(numero));
            System.out.printf("Número arredondado pro centésimo mais próximo: %f%n", roundToHundreths(numero));
            System.out.printf("Número arredondado pro milésimo mais próximo: %f%n", roundToThousandths(numero));

            System.out.print("Digite um valor ou 0 para sair: ");
            numero = sc.nextDouble();
        }
    }

    public static double roundToInteger(double numero) {
        return Math.floor(numero + 0.5);
    }

    public static double roundToTenths(double numero) {
        return Math.floor(numero * 10 + 0.5) / 10;
    }

    public static double roundToHundreths(double numero) {
        return Math.floor(numero * 100 + 0.5) / 100;
    }

    public static double roundToThousandths(double numero) {
        return Math.floor(numero * 1000 + 0.5) / 1000;
    }
}
