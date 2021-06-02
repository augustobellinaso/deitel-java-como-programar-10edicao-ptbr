package capitulo6.exercicios.exercicio13;

import java.security.SecureRandom;

/**
 * @author augustobellinaso
 */
public class NumerosAleatorios {

    public static SecureRandom random = new SecureRandom();

    public static void main(String[] args) {

        //a) 2, 4, 6, 8, 10.
        System.out.println(2 + 2 * random.nextInt(5));

        //b) 3, 5, 7, 9, 11.
        System.out.println(3 + 2 * random.nextInt(5));

        //c) 6, 10, 14, 18, 22.
        System.out.println(6 + 4 * random.nextInt(5));
    }
}
