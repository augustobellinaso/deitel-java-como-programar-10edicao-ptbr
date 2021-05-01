package capitulo5.exercicios.exercicio21;

/**
 * @author augustobellinaso
 */
public class TriplosPitagoras {

    public static void main(String[] args) {

        System.out.println("TRIPLOS DE PITÁGORAS");
        System.out.printf("%6s \t %6s \t %6s%n", "Lado 1", "Lado 2", "Lado 3");

        for (int lado1 = 1; lado1 <= 500; lado1++) {

            for (int lado2 = 1; lado2 <= 500; lado2++) {

                for (int lado3 = 1; lado3 <= 500; lado3++) {

                    if ((lado1 * lado1 + lado2 * lado2 == lado3 * lado3) && lado1 < lado2) {
                        System.out.printf("%6d \t %6d \t %6d%n", lado1, lado2, lado3);

                    }
                }
            }
        }
    }
}
