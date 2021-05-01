package capitulo5.exercicios.exercicio25;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class LosangoModificado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Número de linhas do losango (número ímpar de 1 a 19): ");
        int linhas = sc.nextInt();

        while (linhas < 1 || linhas > 19 || linhas % 2 == 0) {
            System.out.print("Número de linhas do losango (número ímpar de 1 a 19): ");
            linhas = sc.nextInt();
        }

        //PARTE SUPERIOR
        for (int i = 1; i <= linhas / 2; i++) {
            for (int j = linhas / 2; j >= i; j--) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
            for (int l = 1; l < i; l++) {
                System.out.print('*');
            }
            System.out.println();
        }
        //PARTE CENTRAL
        for (int i = 1; i <= linhas; i++) {
            System.out.print('*');
        }
        System.out.println();

        //PARTE INFERIOR
        for (int i = 1; i <= linhas / 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(' ');
            }

            for (int k = linhas / 2; k >= i; k--) {
                System.out.print('*');
            }

            for (int l = linhas / 2; l > i; l--) {
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
