package capitulo5.exercicios.exercicio11;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class Exercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int menor = 0;

        System.out.print("Informa a quantidade de números que deseja inserir: ");
        int qtdeNumeros = sc.nextInt();

        if (qtdeNumeros != 0) {
            //Solicitando o primeiro valor pra poder armazenar como sendo o menor valor

            for (int i = 1; i <= qtdeNumeros; i++) {
                System.out.printf("Digite o %dº número: ", i);
                numero = sc.nextInt();

                if (i == 1) {
                    menor = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }
        } else {
            System.out.println("Fim da execução. Nenhum número foi inserido.");
        }

        System.out.println("Menor valor inserido: " + menor);

    }
}
