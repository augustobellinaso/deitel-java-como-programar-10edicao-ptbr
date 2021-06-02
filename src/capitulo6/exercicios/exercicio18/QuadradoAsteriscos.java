package capitulo6.exercicios.exercicio18;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class QuadradoAsteriscos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        int side = sc.nextInt();

        squareOfAsterisks(side);
    }


    public static void squareOfAsterisks(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
