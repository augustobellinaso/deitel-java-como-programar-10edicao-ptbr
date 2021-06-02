package capitulo6.exercicios.exercicio9;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class ArredondandoNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;

        System.out.print("Digite um valor ou 0 para sair: ");
        numero = sc.nextDouble();

        while (numero != 0) {
            System.out.printf("Número original: %f | Número arredondado: %f%n", numero, Math.floor(numero + 0.5));

            System.out.print("Digite um valor ou 0 para sair: ");
            numero = sc.nextDouble();
        }


    }


}
