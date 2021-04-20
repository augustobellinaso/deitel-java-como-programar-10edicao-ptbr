package capitulo4.exercicios.exercicio36;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class LadosTrianguloDireito {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro diferente de 0: ");
        int num1 = sc.nextInt();
        while (num1 == 0) {
            System.out.println("Número deve ser diferente de 0. Digite novamente.");
            System.out.print("Digite um número inteiro diferente de 0: ");
            num1 = sc.nextInt();
        }

        System.out.print("Digite outro número inteiro diferente de 0: ");
        int num2 = sc.nextInt();
        while (num2 == 0) {
            System.out.println("Número deve ser diferente de 0. Digite novamente.");
            System.out.print("Digite outro número inteiro diferente de 0: ");
            num2 = sc.nextInt();
        }

        System.out.print("Digite mais um número inteiro diferente de 0: ");
        int num3 = sc.nextInt();
        while (num3 == 0) {
            System.out.println("Número deve ser diferente de 0. Digite novamente.");
            System.out.print("Digite mais um número inteiro diferente de 0: ");
            num3 = sc.nextInt();
        }

        if (num1 * num1 == num2 * num2 + num3 * num3) {
            System.out.println("Esses números formam um triângulo direito");
        } else if (num1 * num1 + num2 * num2 == num3 * num3) {
            System.out.println("Esses números formam um triângulo direito");
        } else if (num3 * num3 == num2 * num2 + num1 * num1) {
            System.out.println("Esses números formam um triângulo direito");
        } else {
            System.out.println("Esses números não formam um triângulo direito.");
        }
    }
}