package capitulo5.exercicios.exercicio18;

/**
 * @author augustobellinaso
 */
public class Exercicio18 {

    public static void main(String[] args) {

        int valorEmDeposito;
        int valorInicial = 100000; //valor em centavos (1000 reais)
        int taxa = 5;
        int centavos;
        int reais;

        System.out.printf("%s%20s %n", "Ano", "Valor em Depósito");
        for (int ano = 1; ano <= 10; ano++) {

            valorEmDeposito = (valorInicial * (100 + taxa)) / 100;
            valorInicial = valorEmDeposito;
            reais = valorEmDeposito / 100;
            centavos = valorEmDeposito % 100;

            System.out.printf("%3d %20d.%d%n", ano, reais, centavos);
        }
    }
}
