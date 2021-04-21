package capitulo4.exercicios.exercicio37;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class Exercicio37c {

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

        System.out.print("Digite o valor do argumento da exponencial: ");
        double argumento = sc.nextDouble();

        while (contador <= numTermos) {

            int fatorial = 1;
            int contador2 = 1;

            while (contador2 <= contador) {
                fatorial *= contador2;
                contador2++;
            }

            exp = exp + argumento / fatorial;

            contador++;
        }

        System.out.printf("Aproximação para e com %d termos: %f", numTermos, exp);
    }
}
