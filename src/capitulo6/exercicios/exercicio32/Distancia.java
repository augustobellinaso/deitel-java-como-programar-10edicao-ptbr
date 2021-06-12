package capitulo6.exercicios.exercicio32;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class Distancia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Coordenada X do primeiro ponto: ");
        double x1 = sc.nextDouble();
        System.out.print("Coordenada Y do primeiro ponto: ");
        double y1 = sc.nextDouble();
        System.out.print("Coordenada X do segundo ponto: ");
        double x2 = sc.nextDouble();
        System.out.print("Coordenada Y do segundo ponto: ");
        double y2 = sc.nextDouble();

        System.out.printf("A distância entre os pontos (%.2f; %.2f) e (%.2f; %.2f) é: %f", x1, y1, x2, y2, distance(x1, y1, x2, y2));
    }

    public static double distance(double x1, double y1, double x2, double y2) {

        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
