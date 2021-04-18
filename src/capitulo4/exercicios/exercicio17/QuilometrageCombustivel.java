package capitulo4.exercicios.exercicio17;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class QuilometrageCombustivel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalDirigido = 0;
        int totalLitros = 0;
        int contador = 0;

        System.out.print("Digite a quantidade de quilômetros dirigidos ou -1 para sair: ");
        int qtdeDirigida = input.nextInt();

        while (qtdeDirigida != -1) {
            totalDirigido += qtdeDirigida;
            contador++;
            System.out.print("Digite a quantida de litros de combustível consumidos: ");
            int litros = input.nextInt();
            totalLitros += litros;

            double media = (double) qtdeDirigida / litros;
            System.out.println();
            System.out.println("Consumo de combustível da viagem " + contador + ": " + media + "km/L.");
            System.out.println("Total dirigido em " + contador + " viagem (ns): " + totalDirigido + "km");
            System.out.println("Consumo total de combústivel em " + contador + " viagem(ns): " + totalLitros + "L");
            System.out.println();

            System.out.print("Digite a quantidade de quilômetros dirigidos ou -1 para sair: ");
            qtdeDirigida = input.nextInt();

        }



    }
}
