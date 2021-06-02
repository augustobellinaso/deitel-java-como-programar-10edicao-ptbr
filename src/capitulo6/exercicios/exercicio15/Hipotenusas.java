package capitulo6.exercicios.exercicio15;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class Hipotenusas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do triângulo: ");
        double side1 = sc.nextDouble();

        System.out.print("Digite o segundo lado do triângulo: ");
        double side2 = sc.nextDouble();
        System.out.printf("A hipotenusa do triângulo com lados %f e %f é: %f%n", side1, side2, hypothenuse(side1, side2));

    }

    public static double hypothenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
