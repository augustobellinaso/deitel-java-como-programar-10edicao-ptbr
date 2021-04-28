package capitulo4.exercicios.exercicio39;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class CrescimentoDemografico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a população mundial atual (em bilhões): ");
        double popAtual = sc.nextDouble();

        System.out.print("Digite a taxa de crescimento demográfico anual: ");
        double taxa = sc.nextDouble();

        System.out.println("ANO \t\t POPULAÇÃO (em bilhões) \t\t Aumento (em bilhões)");
        int ano = 2022;
        while (ano <= 2097) {
            System.out.printf("%4d \t\t %22.2f \t\t %20.2f%n", ano, popAtual * taxa, popAtual * taxa - popAtual);
            popAtual *= taxa;
            ano++;
        }

    }
}
