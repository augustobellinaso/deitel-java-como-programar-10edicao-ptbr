package capitulo6.exercicios.exercicio33;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class CrapsModificado {

    private static final SecureRandom secureRandom = new SecureRandom();
    private static final Scanner sc = new Scanner(System.in);

    private enum Status {
        CONTINUAR,
        VENCEU,
        PERDEU
    };

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {

        int minhaPontuacao = 0;
        CrapsModificado.Status statusDoJogo;
        double saldoConta = 1000;
        double aposta;
        boolean continuar = true;

        do {

            int mensagemAleatoria = secureRandom.nextInt(3);
            System.out.printf("Seu saldo em conta é: %.2f%n", saldoConta);
            System.out.printf("Qual a sua aposta? ");
            aposta = sc.nextDouble();

            while (aposta > saldoConta) {
                System.out.printf("Valor inválido. Digite novamente: ");
                aposta = sc.nextDouble();
            }

            int somaDosDados = jogarDoisDados();
            switch (somaDosDados) {
                case SEVEN:
                case YO_LEVEN:
                    statusDoJogo = CrapsModificado.Status.VENCEU;
                    saldoConta += aposta;
                    break;
                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    statusDoJogo = CrapsModificado.Status.PERDEU;
                    saldoConta -= aposta;
                    break;
                default:
                    statusDoJogo = CrapsModificado.Status.CONTINUAR;
                    minhaPontuacao = somaDosDados;
                    System.out.printf("Pontuação atual: %d%n", minhaPontuacao);
                    break;
            }

            while (statusDoJogo == CrapsModificado.Status.CONTINUAR) {
                somaDosDados = jogarDoisDados();

                if (somaDosDados == minhaPontuacao) {
                    statusDoJogo = CrapsModificado.Status.VENCEU;
                    saldoConta += aposta;
                } else if (somaDosDados == SEVEN) {
                    statusDoJogo = CrapsModificado.Status.PERDEU;
                    saldoConta -= aposta;
                }
            }

            if (statusDoJogo == CrapsModificado.Status.VENCEU) {
                System.out.println("Jogador Venceu!");
            } else {
                System.out.println("Jogador Perdeu!");
            }

            mensagem(mensagemAleatoria);

            System.out.printf("Digite 1 para jogar novamente ou 0 para sair: ");
            if (sc.nextInt() == 0) {
                continuar = false;
            }

            if (saldoConta == 0.0) {
                continuar = false;
                System.out.printf("Você não tem mais dinheiro!");
            }
        } while (continuar);
    }

    public static int jogarDado() {
        return 1 + secureRandom.nextInt(6);
    }

    public static int jogarDoisDados() {
        int dado1 = jogarDado();
        int dado2 = jogarDado();
        int soma = dado1 + dado2;

        System.out.printf("Jogar obteve: %d + %d = %d%n", dado1, dado2, soma);

        return soma;
    }

    public static void mensagem(int msg) {
        if (msg == 0) {
            System.out.println("Oh, parece que você vai quebrar, hein?");
        } else if (msg == 1) {
            System.out.println("Ah, vamos lá, dê uma chance para sua sorte!");
        } else {
            System.out.println("Você está montado na grana. Agora é hora de trocar essas fichas e embolsar o dinheiro!");
        }
    }
}
