package capitulo5.exercicios.exercicio14;

/**
 * @author augustobellinaso
 */
public class Exercicio14 {

    public static void main(String[] args) {

        double amount;
        double principal = 1000.0;

        for (int rate = 5; rate <= 10; rate++) {
            System.out.println("=======TAXA DE JUROS DE  " + rate + "%======");
            System.out.printf("%3s  %20s %n", "Ano", "Quantidade em conta");
            for (int year = 1; year <= 10; year++) {

                amount = principal * Math.pow(1.0 + (double) rate / 100, year);

                System.out.printf("%3d%,20.2f%n", year, amount);
            }
            System.out.println();
        }

    }
}
