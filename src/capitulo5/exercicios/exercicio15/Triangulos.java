package capitulo5.exercicios.exercicio15;

/**
 * @author augustobellinaso
 */
public class Triangulos {

    public static void main(String[] args) {

        //LETRA a
        System.out.println("PADRÃO DA LETRA a)");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();
        //LETRA b
        System.out.println("PADRÃO DA LETRA b)");
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        //LETRA c
        System.out.println("PADRÃO DA LETRA c)");
        for (int i = 1; i <= 10; i++) {

            for (int k = 0; k < i; k++) {
                System.out.print(' ');
            }

            for (int j = 10; j >= i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        //LETRA d
        System.out.println("PADRÃO DA LETRA d)");
        for (int i = 1; i <= 10; i++) {

            for (int k = 10; k > i; k--) {
                System.out.print(' ');
            }

            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
    }
}
