package capitulo6.exercicios.exercicio12;

import java.security.SecureRandom;

/**
 * @author augustobellinaso
 */
public class NumerosAleatorios {

    public static SecureRandom random = new SecureRandom();

    public static void main(String[] args) {

        //a) 1 <= n <= 2.
        System.out.println(1 + random.nextInt(2));

        //b) 1 <= n <= 100.
        System.out.println(1 + random.nextInt(100));

        //c) 0 <= n <= 9.
        System.out.println(random.nextInt(10));

        //d) 1000 <= n <= 1112.
        System.out.println(1000 + random.nextInt(113));

        //e) -1 <= n <= 1.
        System.out.println(-1 + random.nextInt(3));

        //f) -3 <= n <= 11
        System.out.println(-3 + random.nextInt(15));



    }
}
