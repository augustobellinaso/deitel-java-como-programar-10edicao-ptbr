package capitulo6.exercicios.exercicio25;

/**
 * @author augustobellinaso
 */
public class NumerosPrimos {

    public static void main(String[] args) {

        final int MAXIMUM_NUMBER = 100;

        System.out.println("Números primos testando até o limite: ");
        for (int i = 1; i <= MAXIMUM_NUMBER; i++) {
            if (isPrimo(i)) {
                System.out.print(i);
                System.out.println();
            }
        }

        System.out.println("Números primos testando até a metade: ");
        for (int i = 1; i <= MAXIMUM_NUMBER; i++) {
            if (isPrimoMetade(i)) {
                System.out.print(i);
                System.out.println();
            }
        }

        System.out.println("Números primos testando até a raíz quadrada: ");
        for (int i = 1; i <= MAXIMUM_NUMBER; i++) {
            if (isPrimoRaizQuadrada(i)) {
                System.out.print(i);
                System.out.println();
            }
        }

    }

    public static boolean isPrimo(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrimoMetade(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrimoRaizQuadrada(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
