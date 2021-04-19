package capitulo4.exercicios.exercicio31;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class BinarioParaDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numDecimal = 0;
        int potencia = 0;
        int restoDivisao;

        System.out.print("Digite um número binário: ");
        int numBinario = sc.nextInt();
        int binario = numBinario; //para armazenar o valor inserido


        while (numBinario != 0) {
            restoDivisao = numBinario % 10;
            numDecimal += (int) (restoDivisao * Math.pow(2, potencia));
            numBinario /= 10;
            potencia++;
        }

        System.out.printf("Número binário inserido: %d%n", binario);
        System.out.printf("Equivalente decimal: %d%n", numDecimal);






    }
}
