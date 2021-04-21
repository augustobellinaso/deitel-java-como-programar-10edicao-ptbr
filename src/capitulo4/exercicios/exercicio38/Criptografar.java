package capitulo4.exercicios.exercicio38;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class Criptografar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Solicitando número e validando a entrada
        System.out.print("Digite um número com 4 dígitos: ");
        int numero = sc.nextInt();

        while(numero < 1000 || numero > 9999) {
            System.out.println("Número inválido. Digite novamente.");
            System.out.print("Digite um número com 4 dígitos: ");
            numero = sc.nextInt();
        }

        int numeroOriginal = numero;

        int digito;
        int novoDigito;
        int numeroCriptografado = 0;
        int contador = 0;
        while (contador <= 3) {
            digito = numero % 10;
            numero /= 10;
            novoDigito = (digito + 7) % 10;

            //Para fazer a troca das posições dos dígitos:
            if (contador == 0) {
                numeroCriptografado = numeroCriptografado + novoDigito * (int)(Math.pow(10, contador + 2));
            } else if (contador == 1) {
                numeroCriptografado = numeroCriptografado + novoDigito * (int)(Math.pow(10, contador + 2));
            } else if (contador == 2) {
                numeroCriptografado = numeroCriptografado + novoDigito * (int)(Math.pow(10, contador - 2));
            } else {
                numeroCriptografado = numeroCriptografado + novoDigito * (int)(Math.pow(10, contador - 2));
            }


            contador++;

        }


        System.out.println("Número original: " + numeroOriginal);
        System.out.println("Número criptografado: " + numeroCriptografado);




    }
}
