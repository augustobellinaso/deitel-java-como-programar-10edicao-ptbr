package capitulo5.exercicios.exercicio22;

/**
 * @author augustobellinaso
 */
public class TriangulosModificados {

    public static void main(String[] args) {


        for (int linha = 1; linha <= 10; linha++) {

            //Padrão da letra A
            for (int j = 1; j <= linha; j++) {
                System.out.print('*');
            }
            for (int k = 10; k >= linha; k--) {
                System.out.print(' ');
            }

            //PADRÃO LETRA B
            for (int j = 10; j >= linha; j--) {
                System.out.print('*');
            }
            for (int k = 1; k <= linha; k++) {
                System.out.print(' ');
            }

            //padrão letra c
            for (int k = 0; k <= linha; k++) {
                System.out.print(' ');
            }
            for (int j = 10; j >= linha; j--) {
                System.out.print('*');
            }

            //padrão letra d
            for (int k = 10; k >= linha; k--) {
                System.out.print(' ');
            }
            for (int j = 1; j <= linha; j++) {
                System.out.print('*');
            }


            System.out.println();
        }
    }
}
