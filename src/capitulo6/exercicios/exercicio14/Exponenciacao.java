package capitulo6.exercicios.exercicio14;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class Exponenciacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int expoente;

        System.out.printf("Digite o expoente ou 0 (ou algum inteiro negativo) para sair: ");
        expoente = sc.nextInt();

        while (expoente > 0) {
            System.out.printf("Digite a base: ");
            base = sc.nextInt();

            System.out.printf("Resultado da operação: %d%n", integerPower(base, expoente));


            System.out.printf("Digite o expoente ou 0 (ou algum inteiro negativo) para sair: ");
            expoente = sc.nextInt();
        }
    }

    public static int integerPower(int base, int expoente) {
        int resultado = 1;
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        return resultado;
    }
}
