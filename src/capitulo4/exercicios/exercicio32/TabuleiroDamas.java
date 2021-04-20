package capitulo4.exercicios.exercicio32;

/**
 * @author augustobellinaso
 */
public class TabuleiroDamas {

    public static void main(String[] args) {

        int row = 1;


        while (row <= 8) {

            int column = 1;

            while (column <= 8) {
                System.out.print("* ");
                column++;
            }
            System.out.println();

            if (row % 2 == 1) {
                System.out.print(" ");
            }


            row++;
        }
    }
}
