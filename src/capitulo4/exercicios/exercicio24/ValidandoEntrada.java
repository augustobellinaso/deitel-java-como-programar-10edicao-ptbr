package capitulo4.exercicios.exercicio24;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class ValidandoEntrada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int passaram = 0;
        int reprovaram = 0;
        int contadorEstudantes = 1;

        while (contadorEstudantes <= 10) {

            System.out.print("Digite o resultado (1 = passou, 2 = reprovou): ");
            int resultado = sc.nextInt();

            while (resultado != 1 && resultado != 2) {
                System.out.println("Opção inválida. Digite novamente.");
                System.out.print("Digite o resultado (1 = passou, 2 = reprovou): ");
                resultado = sc.nextInt();
            }

            if (resultado == 1) {
                passaram++;
            } else {
                reprovaram++;
            }

            contadorEstudantes++;
        }

        System.out.printf("Passaram: %d%nReprovaram: %d%n", passaram, reprovaram);

        if (passaram > 8) {
            System.out.println("Bônus para o instrutor!");
        }
    }


}
