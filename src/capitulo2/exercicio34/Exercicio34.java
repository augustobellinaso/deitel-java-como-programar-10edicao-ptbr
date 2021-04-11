package capitulo2.exercicio34;

import java.util.Scanner;

/**
 * @author Augusto Loose Bellinaso
 */
public class Exercicio34 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("População mundial em 2021: ");
        long pop = input.nextLong();
        System.out.print("Taxa de crescimento demográfico anual (em valor absoluto): ");
        int taxa = input.nextInt();

        long pop21 = (pop * taxa) / 100;
        long pop22 = (pop21 * taxa) / 100;
        long pop23 = (pop22 * taxa) / 100;
        long pop24 = (pop23 * taxa) / 100;
        long pop25 = (pop24 * taxa) / 100;
        long pop26 = (pop25 * taxa) / 100;
        System.out.printf("População estimada para 2022: %d%n", pop22);
        System.out.printf("População estimada para 2023: %d%n", pop23);
        System.out.printf("População estimada para 2024: %d%n", pop24);
        System.out.printf("População estimada para 2025: %d%n", pop25);
        System.out.printf("População estimada para 2026: %d%n", pop26);

    }
}
