package capitulo4.exercicios.exercicio37;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class Exercicio37b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double exp = 1;
        int contador = 1;

        System.out.print("Digite o número de termos para calcular a aproximação: ");
        int numTermos = sc.nextInt();
        while (numTermos < 0) {
            System.out.println("Número inválido. Digite novamente.");
            System.out.print("Digite o número de termos para calcular a aproximação: ");
            numTermos = sc.nextInt();
        }

        while (contador <= numTermos) {

            int fatorial = 1;
            int contador2 = 1;

            while (contador2 <= contador) {
                fatorial *= contador2;
                contador2++;
            }

            exp = exp + 1 / (double) fatorial;

            contador++;
        }

        System.out.printf("Aproximação para e com %d termos: %f", numTermos, exp);


    }
}
