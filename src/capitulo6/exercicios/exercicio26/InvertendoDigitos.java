package capitulo6.exercicios.exercicio26;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class InvertendoDigitos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int numero = sc.nextInt();

        System.out.printf("O número com os dígitos invertidos fica: %d", inverterDigitos(numero));

    }

    public static int inverterDigitos(int numero) {
        String novoNumero = "";

        while (numero > 0) {
            novoNumero += numero % 10;
            numero /= 10;
        }

        return Integer.parseInt(novoNumero);
    }
}
