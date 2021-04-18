package capitulo4.exercicios.exercicio20;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class CalculadoraSalarios {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int qtdeEmpregados;
        int horasTrabalhadas;
        double valorHoraTrabalhada;
        double salarioTotal;
        int contador = 1;

        System.out.print("Quantidade de empregados: ");
        qtdeEmpregados = sc.nextInt();

        while(contador <= qtdeEmpregados) {
            System.out.print("Horas trabalhadas pelo empregado " + contador + ": ");
            horasTrabalhadas = sc.nextInt();
            System.out.print("Salário-hora do empregado " + contador + ": ");
            valorHoraTrabalhada = sc.nextInt();

            if (horasTrabalhadas <= 40) {
                salarioTotal = horasTrabalhadas * valorHoraTrabalhada;
            } else {
                int horasExtras = horasTrabalhadas - 40;
                salarioTotal = horasTrabalhadas * valorHoraTrabalhada + horasExtras * valorHoraTrabalhada * 1.5;
            }

            System.out.printf("Salário bruto do empregado %d: R$%.2f%n", contador, salarioTotal);

            contador++;

        }
    }
}
