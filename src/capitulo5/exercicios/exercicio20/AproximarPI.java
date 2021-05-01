package capitulo5.exercicios.exercicio20;

/**
 * @author augustobellinaso
 */
public class AproximarPI {

    public static void main(String[] args) {

        double valorPi = 0.0;
        int termosNecessarios = 0;
        int x = 1;

        System.out.printf("%8s \t %16s %n", "Nº TERMOS", "VALOR DE PI");

        int termos = 1;
        int mult = 1;
        int divisor = 1;
        while (termos <= 200000) {


            valorPi += mult * 4.0 / divisor;
            mult *= -1;

            if (Math.abs(valorPi - 3.14159) <= 0.000005) {
                while ( x > 0) {
                    termosNecessarios = termos;
                    x--;
                }
            }


            System.out.printf("%8d \t %16.16f%n", termos, valorPi);

            divisor += 2;
            termos++;
        }

        System.out.println();
        System.out.printf("São necessários %d termos para obter um valor de PI que começa com 3.14159!", termosNecessarios);





    }
}
