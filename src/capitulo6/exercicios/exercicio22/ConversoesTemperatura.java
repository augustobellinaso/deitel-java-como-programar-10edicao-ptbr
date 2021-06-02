package capitulo6.exercicios.exercicio22;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class ConversoesTemperatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Conversor de Temperatura \n" +
                "1 - Fahrenheit para Celsius \n" +
                "2 - Celsius para Fahrenheit \n" +
                "Digite a opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.printf("Digite a temperatura em Fahrenheit: ");
                double tF = sc.nextDouble();
                System.out.printf("%.1fºF equivalem à %.1fºC", tF, converteParaCelsius(tF));
                break;
            case 2:
                System.out.printf("Digite a temperatura em Celsius: ");
                double tC = sc.nextDouble();
                System.out.printf("%.1fºC equivalem à %.1fºF", tC, converteParaFahrenheit(tC));
                break;
        }


    }

    public static double converteParaCelsius(double tFahrenheit) {
        return 5.0 / 9.0 * (tFahrenheit - 32);
    }

    public static double converteParaFahrenheit(double tCelsius) {
        return 9.0 / 5.0 * tCelsius + 32;
    }
}
