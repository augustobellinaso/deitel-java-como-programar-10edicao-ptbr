package capitulo6.exercicios.exercicio35;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class CAI1 {

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
                System.out.println("Não. Por favor, tente novamente.");
                gerarPergunta(num1, num2);
                resposta = sc.nextInt();
            }

            System.out.println("Muito bem!");

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
}
