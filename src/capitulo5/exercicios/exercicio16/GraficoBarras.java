package capitulo5.exercicios.exercicio16;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class GraficoBarras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.printf("Digite 5 números entre 1 e 30 espaçados e ao final digite -1 para finalizar: ");


        while(sc.hasNextInt()) {

            num = sc.nextInt();

            if (num == -1) {
                break;
            }

            for (; num > 0; num--) {
                System.out.print('*');
            }
            System.out.println();


        }




    }
}
