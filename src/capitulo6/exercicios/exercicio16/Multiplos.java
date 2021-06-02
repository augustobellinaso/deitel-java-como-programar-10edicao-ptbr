package capitulo6.exercicios.exercicio16;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class Multiplos {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.printf("Digite dois inteiros separados por um espaço (ou 0 0 para sair): ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        while(num1 != 0 && num2 != 0) {
            System.out.printf("%d %s %d%n", num2, (isMultiple(num1, num2) ? "é múltiplo de" : "não é múltiplo de"), num1);

            System.out.printf("Digite dois inteiros separados por um espaço (ou 0 0 para sair): ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }

    }

    public static boolean isMultiple(int a, int b) {
        return (b % a == 0);
    }
}
