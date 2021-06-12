package capitulo6.exercicios.exercicio36;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class CAI2 {

    public static SecureRandom random = new SecureRandom();
    public static Scanner sc = new Scanner(System.in);
    public static final int NUMERO_MAXIMO = 10;

    public static void main(String[] args) {

        int resposta;
        boolean continuar = true;

        do {
            int num1 = random.nextInt(NUMERO_MAXIMO);
            int num2 = random.nextInt(NUMERO_MAXIMO);


            gerarPergunta(num1, num2);
            resposta = sc.nextInt();

            while (!validarResposta(num1, num2, resposta)) {
                int opcaoMensagem = random.nextInt(4);
                mensagensErro(opcaoMensagem);
                gerarPergunta(num1, num2);
                resposta = sc.nextInt();
            }
            int opcaoMensagem = random.nextInt(4);
            mensagensSucesso(opcaoMensagem);

            System.out.printf("Digite 0 se deseja sair: ");
            if (sc.nextInt() == 0) {
                continuar = false;
            }

        } while (continuar);



    }

    public static void gerarPergunta(int num1, int num2) {
        System.out.printf("Quanto é %d vezes %d? ", num1, num2);
    }

    public static boolean validarResposta(int num1, int num2, int resp) {
        return resp == num1 * num2;
    }

    public static void mensagensSucesso(int opcao) {
        switch (opcao) {
            case 0:
                System.out.println("Muito bom!");
                break;
            case 1:
                System.out.println("Excelente!");
                break;
            case 2:
                System.out.println("Bom trabalho!");
                break;
            case 3:
                System.out.println("Mantenha um bom trabalho!");
                break;
        }
    }

    public static void mensagensErro(int opcao) {
        switch (opcao) {
            case 0:
                System.out.println("Não. Por favor, tente novamente.");
                break;
            case 1:
                System.out.println("Errado. Tente mais uma vez.");
                break;
            case 2:
                System.out.println("Não desista!");
                break;
            case 3:
                System.out.println("Não. Continue tentando.");
                break;
        }
    }
}
