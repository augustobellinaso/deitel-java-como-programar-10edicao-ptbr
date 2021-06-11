package capitulo6.exercicios.exercicio30;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class AdivinhaNumero {

    private static final SecureRandom random = new SecureRandom();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int chute;
        int escolha;
        boolean adivinharNovamente = true;

        while (adivinharNovamente) {
            System.out.print("Digite um número entre 1 e 1000: ");
            chute = sc.nextInt();
            sc.nextLine();

            int numeroGerado = 1 + random.nextInt(1000);

            while (chute != numeroGerado) {
                if (chute < numeroGerado) {
                    System.out.println("Muito baixo! Tente novamente!");
                } else if (chute > numeroGerado) {
                    System.out.println("Muito alto! Tente novamente!");
                }

                System.out.print("Digite o novo chute: ");
                chute = sc.nextInt();
                sc.nextLine();
            }

            System.out.println("Parabéns! Você adivinhou!");
            System.out.print("Digite 1 para jogar de novo ou 0 para sair: ");
            escolha = sc.nextInt();
            sc.nextLine();

            if (escolha == 0) {
                adivinharNovamente = false;
            }

        }
    }

}
