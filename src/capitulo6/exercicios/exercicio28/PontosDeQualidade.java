package capitulo6.exercicios.exercicio28;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class PontosDeQualidade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a média do aluno: ");
        double media = sc.nextDouble();

        System.out.printf("Qualidade do aluno: %d", qualityPoints(media));

    }

    public static int qualityPoints(double media) {
        if (media < 60) {
            return 0;
        }
        if (media <= 69) {
            return 1;
        }
        if (media <= 79) {
            return 2;
        }
        if (media <= 89) {
            return 3;
        }

        return 4;
    }

}
