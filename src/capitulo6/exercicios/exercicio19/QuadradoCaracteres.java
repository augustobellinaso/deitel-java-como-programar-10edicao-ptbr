package capitulo6.exercicios.exercicio19;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class QuadradoCaracteres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        int side = sc.nextInt();
        System.out.print("Digite o caractere que deseja usar pra fazer o quadrado: ");
        char fill = sc.next().charAt(0);

        squareOfCharacters(side, fill);
    }


    public static void squareOfCharacters(int side, char fillCharacter) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }
}
