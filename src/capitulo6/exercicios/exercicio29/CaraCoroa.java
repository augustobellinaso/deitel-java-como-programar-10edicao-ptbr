package capitulo6.exercicios.exercicio29;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class CaraCoroa {

    private static final Scanner sc = new Scanner(System.in);
    private static final int JOGAR_MOEDA = 1;
    private static final int SAIR = 0;
    private static final SecureRandom random = new SecureRandom();

    private enum Coin {
        CARA,
        COROA;
    }

    public static void main(String[] args) {

        int qtdeCara = 0;
        int qtdeCoroa = 0;
        int qtdeLancamentos = 0;

        int opcao = exibirMenu();
        while (opcao != SAIR) {
            if (flip() == Coin.CARA) {
                qtdeCara++;
                System.out.println("Cara");
            } else {
                qtdeCoroa++;
                System.out.println("Coroa");
            }

            qtdeLancamentos++;
            opcao = exibirMenu();
        }

        System.out.printf("Após %d lançamentos: %n", qtdeLancamentos);
        System.out.printf("Cara: %d vezes%n", qtdeCara);
        System.out.printf("Coroa: %d vezes%n", qtdeCoroa);


    }


    public static int exibirMenu() {
        System.out.print("Menu de opções: \n" +
                "1 - Jogar moeda \n" +
                "0 - Sair. \n" +
                "Insira a opção desejada: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        while (opcao > JOGAR_MOEDA || opcao < SAIR) {
            System.out.print("Opção inválida, digite novamente: ");
            opcao = sc.nextInt();
            sc.nextLine();
        }

        return opcao;
    }

    public static Coin flip() {
        int jogada = random.nextInt(2);

        if (jogada == 0) {
            return Coin.CARA;
        }

        return Coin.COROA;

    }


}
