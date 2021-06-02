package capitulo6.estudodecasocraps;

import java.security.SecureRandom;

public class Craps {

    private static final SecureRandom secureRandom = new SecureRandom();

    private enum Status {
        CONTINUAR,
        VENCEU,
        PERDEU};

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {

        int minhaPontuacao = 0;
        int somaDosDados = jogarDoisDados();
        Status statusDoJogo;

        switch (somaDosDados) {
            case SEVEN:
            case YO_LEVEN:
                statusDoJogo = Status.VENCEU;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                statusDoJogo = Status.PERDEU;
                break;
            default:
                statusDoJogo = Status.CONTINUAR;
                minhaPontuacao = somaDosDados;
                System.out.printf("Pontuação atual: %d%n", minhaPontuacao);
                break;
        }


        while (statusDoJogo == Status.CONTINUAR) {
            somaDosDados = jogarDoisDados();

            if (somaDosDados == minhaPontuacao) {
                statusDoJogo = Status.VENCEU;
            } else if (somaDosDados == SEVEN) {
                statusDoJogo = Status.PERDEU;
            }
        }

        if (statusDoJogo == Status.VENCEU) {
            System.out.println("Jogador Venceu!");
        } else {
            System.out.println("Jogador Perdeu!");
        }

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

}
