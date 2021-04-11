package capitulo2.exercicio33;

import java.util.Scanner;

/**
 * @author Augusto Loose Bellinaso
 */
public class Exercicio33 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu peso em kg: ");
        int peso = input.nextInt();

        System.out.print("Digite a sua altura em m: ");
        double altura = input.nextDouble();

        int imc = (int) (peso / (altura * altura));

        System.out.printf("Índice de massa corporal: %d%n", imc);
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");

    }
}
