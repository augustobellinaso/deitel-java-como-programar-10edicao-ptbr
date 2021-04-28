package capitulo5.exercicios.exercicio13;

/**
 * @author augustobellinaso
 */
public class Fatoriais {

    public static void main(String[] args) {

        System.out.printf("%6s \t %-20s%n", "NÚMERO", "FATORIAL");
        for (int i = 1; i <= 20; i++) {
            long fat = 1;
            for (int j = 1; j <= i; j++) {
                fat *= j;
            }
            System.out.printf("%6d \t %-20d%n", i, fat);
        }
    }
}
