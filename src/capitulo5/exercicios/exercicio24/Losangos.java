package capitulo5.exercicios.exercicio24;

/**
 * @author augustobellinaso
 */
public class Losangos {

    public static void main(String[] args) {


        //PARTE SUPERIOR
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
            for (int l = 1; l < i; l++) {
                System.out.print('*');
            }
            System.out.println();
        }
        //PARTE CENTRAL
        for (int i = 1; i <= 9; i++) {
            System.out.print('*');
        }
        System.out.println();

        //PARTE INFERIOR
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(' ');
            }

            for (int k = 4; k >= i; k--) {
                System.out.print('*');
            }

            for (int l = 4; l > i; l--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
