package capitulo6.exercicios.exercicio24;

/**
 * @author augustobellinaso
 */
public class NumerosPerfeitos {

    public static void main(String[] args) {

        System.out.println("Números perfeitos entre 1 e 1000: ");

        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                System.out.printf("%d é um número perfeito: %d = ", i, i);
                imprimirFatores(i);
                System.out.println();
            }
        }

    }


    public static boolean isPerfect(int number) {
        int somaFatores = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                somaFatores += i;
            }
        }

        return (somaFatores == number);
    }

    public static void imprimirFatores(int number) {
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " + ");
            }
        }
    }
}
