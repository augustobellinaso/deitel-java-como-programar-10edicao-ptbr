package capitulo4.exercicios.exercicio27;

/**
 * @author augustobellinaso
 */
public class ElseOscilante1 {

    public static void main(String[] args) {

        //letra a
        System.out.println("=========LETRA A=======");

        int x = 5;
        int y = 12;

        if(x < 10)
            if (y > 10)
                System.out.println("*******");
            else
                System.out.println("#######");
        System.out.println("$$$$$$$$$$");




        //letra b
        System.out.println("=============LETRA B=============");
        if (x < 10) {
            if (y > 10) {
                System.out.println("**************");
            } else {
                System.out.println("##########");
                System.out.println("$$$$$$$$$$$$");
            }
        }
    }
}
