package capitulo6.exercicios.exercicio8;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class TaxaEstacionamento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tempoEstacionado = 0;
        double valorTotal;
        int contador = 1;

        System.out.printf("Quantidade em horas que o cliente %d utilizou o estacionamento (digite -1 para sair): ", contador);
        tempoEstacionado = sc.nextDouble();

        while (tempoEstacionado != -1) {
            valorTotal = calculateCharges(tempoEstacionado);

            System.out.printf("Valor total cobrado do cliente %d: R$%.2f%n", contador, valorTotal);
            contador++;

            System.out.printf("Quantidade em horas que o cliente %d utilizou o estacionamento (digite -1 para sair): ", contador);
            tempoEstacionado = sc.nextDouble();

        }

    }

    public static double calculateCharges(double tempoEstacionado) {
        if (tempoEstacionado <= 3) {
            return 2.00;
        }

        if (tempoEstacionado >= 24) {
            return 10.00;
        }

        return 2.00 + (Math.ceil(tempoEstacionado - 3) * 0.5);
    }
}
