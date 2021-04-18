package capitulo4.exercicios.exercicio29;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class QuadradoAsteriscos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado (entre 1 e 20): ");
        int lado = sc.nextInt();

        while (lado < 1 || lado > 20) {
            System.out.println("Valor inválido. Digite novamente.");
            System.out.print("Digite o lado do quadrado (entre 1 e 20): ");
            lado = sc.nextInt();
        }


        int contadorAltura = 1;
        while (contadorAltura <= lado) {

            int contadorLargura = 1;

            while (contadorLargura <= lado) {
                System.out.print("* ");
                contadorLargura++;
            }

            System.out.println();

            contadorAltura++;
        }
    }
}
