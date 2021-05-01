package capitulo5.exercicios.exercicio23;

/**
 * @author augustobellinaso
 */
public class LeisDeMorgan {

    public static void main(String[] args) {
        int x = 4;
        int y = 8;

        System.out.println("LETRA A");
        System.out.printf("Expressão Original: '!(x < 5) && !(y >= 7)' ==> %b%n", !(x < 5) && !(y >= 7));
        System.out.printf("Nova expressão: '!(x < 5 || y >= 7)' ==> %b%n", !(x < 5 || y >= 7));
        System.out.println();

        int a = 5;
        int b = 5;
        int g = 5;

        System.out.println("LETRA B");
        System.out.printf("Expressão Original: '!(a == b) || !(g != 5)' ==> %b%n", !(a == b) || !(g != 5));
        System.out.printf("Nova expressão: '!(a == b && g != 5)' ==> %b%n", !(a == b && g != 5));
        System.out.println();

        System.out.println("LETRA C");
        System.out.printf("Expressão Original: '!((x <= 8) && (y > 4))' ==> %b%n", !((x <= 8) && (y > 4)));
        System.out.printf("Nova expressão: '!(x <= 8) || !(y > 4)' ==> %b%n", !(x <= 8) || !(y > 4));
        System.out.println();

        int i = 3;
        int j = 7;
        System.out.println("LETRA D");
        System.out.printf("Expressão Original: '!((i > 4) || (j <= 6))' ==> %b%n", !((i > 4) || (j <= 6)));
        System.out.printf("Nova expressão: '!(i > 4) && !(j <= 6)' ==> %b%n", !(i > 4) && !(j <= 6));
        System.out.println();

    }
}
