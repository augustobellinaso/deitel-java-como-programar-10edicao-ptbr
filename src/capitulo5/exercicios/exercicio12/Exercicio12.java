package capitulo5.exercicios.exercicio12;

/**
 * @author augustobellinaso
 */
public class Exercicio12 {

    public static void main(String[] args) {

        int prod = 1;

        for (int i = 1; i <= 15; i++) {

            if (i % 2 == 1) {
                prod *= i;
            }
        }

        System.out.println("Produto dos números ímpares de 1 a 15: " + prod);
    }
}
