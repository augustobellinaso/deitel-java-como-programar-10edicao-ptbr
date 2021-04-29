package capitulo5.exercicios.exercicio16;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class GraficoBarras2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 30: ");
        int num1 = sc.nextInt();
        System.out.print("Digite um número entre 1 e 30: ");
        int num2 = sc.nextInt();
        System.out.print("Digite um número entre 1 e 30: ");
        int num3 = sc.nextInt();
        System.out.print("Digite um número entre 1 e 30: ");
        int num4 = sc.nextInt();
        System.out.print("Digite um número entre 1 e 30: ");
        int num5 = sc.nextInt();

        for (int i = 1; i <= num1; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= num2; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= num3; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= num4; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= num5; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
