package capitulo4.exercicios.exercicio23;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class DoisMaioresNumeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        int contador = 1;
        int maior1;
        int maior2 = 0;

        System.out.print("Digite o " + contador + "º número: ");
        numero = sc.nextInt();
        maior1 = numero;

        contador++;

        while (contador <= 10) {
            System.out.print("Digite o " + contador + "º número: ");
            numero = sc.nextInt();

            if (numero > maior1) {
                maior2 = maior1;
                maior1 = numero;
            }

            if (numero < maior1 && numero > maior2) {
                maior2 = numero;
            }



            contador++;
        }

        System.out.printf("Primeiro maior: %d%n", maior1);
        System.out.printf("Segundo maior: %d%n", maior2);


    }
}
