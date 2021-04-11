package capitulo2.exercicio28;

import java.util.Scanner;

/**
 * @author Augusto Loose Bellinaso
 */
public class Exercicio28 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        int raio = input.nextInt();

        System.out.printf("Diâmetro: %d%n", (2 * raio));
        System.out.printf("Circunferência: %f%n", (2 * Math.PI * raio));
        System.out.printf("Área: %f%n", (Math.PI * Math.pow(raio, 2)));
    }
}
