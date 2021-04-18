package capitulo4.exercicios.exercicio21;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class LocalizarMaiorNumero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 1; //para contar as entradas
        int numero; //para armazenar o número digitado
        int maior; //para armazenar o maior número

        System.out.print("Digite o " + contador + "º número: ");
        numero = sc.nextInt();
        maior = numero;

        contador++;


        while(contador <= 10) {
            System.out.print("Digite o " + contador + "º número: ");
            numero = sc.nextInt();


            if (numero > maior) {
                maior = numero;
            }
            contador++;
        }

        System.out.printf("O maior número digitado é: %d.%n", maior);

    }
}
