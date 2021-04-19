package capitulo4.exercicios.exercicio30;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class Palindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro de 5 dígitos: ");
        int numero = sc.nextInt();
        int numeroOriginal = numero;

        while(numero < 10000 || numero > 99999) {
            System.out.println("Número inválido. Digite novamente.");
            System.out.print("Digite um número inteiro de 5 dígitos: ");
            numero = sc.nextInt();
            numeroOriginal = numero;
        }


        int digito1 = numero / 10000;
        numero %= 10000;
        int digito2 = numero / 1000;
        numero %= 1000;
        int digito3 = numero / 100;
        numero %= 100;
        int digito4 = numero / 10;
        int digito5 = numero % 10;

        int numeroInvertido = digito5 * 10000 + digito4 * 1000 + digito3 * 100 + digito2 * 10 + digito1;

        if (numeroOriginal == numeroInvertido) {
            System.out.printf("%d é um palíndromo!", numeroOriginal);
        } else {
            System.out.printf("%d não é um palíndromo.", numeroOriginal);
        }
    }
}
