package capitulo4.exercicios.exercicio37;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class Exercicio37a {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int num = sc.nextInt();

        while (num < 0) {
            System.out.println("Número inválido. Digite novamente.");
            System.out.print("Digite um número inteiro não negativo: ");
            num = sc.nextInt();
        }
        int numOriginal = num;

        int fat = 1;

        if (num == 0) {
            fat = 1;
        } else {
            while (num > 0) {
                fat *= num;
                num--;
            }
        }


        System.out.printf("O fatorial de %d é: %d", numOriginal, fat);
    }
}
