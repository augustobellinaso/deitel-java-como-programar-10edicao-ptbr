package capitulo6.exercicios.exercicio31;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class AdivinhaNumerosModificado {

    private static final SecureRandom random = new SecureRandom();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int chute;
        int escolha;
        int qtdeTentativas = 1;
        boolean adivinharNovamente = true;

        while (adivinharNovamente) {
            System.out.print("Digite um número entre 1 e 1000: ");
            chute = sc.nextInt();
            sc.nextLine();

            int numeroGerado = 1 + random.nextInt(1000);

            while (chute != numeroGerado) {
                if (chute < numeroGerado) {
                    System.out.println("Muito baixo! Tente novamente!");
                    qtdeTentativas++;
                } else if (chute > numeroGerado) {
                    System.out.println("Muito alto! Tente novamente!");
                    qtdeTentativas++;
                }

                System.out.print("Digite o novo chute: ");
                chute = sc.nextInt();
                sc.nextLine();
            }

            System.out.println("Parabéns! Você adivinhou!");
            if (qtdeTentativas < 10) {
                System.out.printf("Você sabe o segredo ou tem muita sorte! %d tentativas%n", qtdeTentativas);
            } else {
                System.out.printf("Você deve ser capaz de fazer melhor. %d tentativas%n ", qtdeTentativas);
            }
            System.out.print("Digite 1 para jogar de novo ou 0 para sair: ");
            escolha = sc.nextInt();
            sc.nextLine();

            if (escolha == 0) {
                adivinharNovamente = false;
            }
        }


    }
}
