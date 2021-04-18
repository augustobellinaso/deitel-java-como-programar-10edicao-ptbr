package capitulo4.exercicios.exercicio28;

/**
 * @author augustobellinaso
 */
public class ElseOscilante2 {

    public static void main(String[] args) {

        //Modificar de acordo com cada necessidade
        //if (y == 8)
        //if (x == 5)
        //System.out.println("@@@@@");
        //else
        //System.out.println("#####");
        //System.out.println("$$$$$");
        //System.out.println("&&&&&");

        //a) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
        //@@@@@
        //$$$$$
        //&&&&&

        int x = 5;
        int y = 8;

        System.out.println("===========LETRA A========");

        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@@@@");
            } else {
                System.out.println("#############");
            }
        }

        System.out.println("$$$$$$$$$$");
        System.out.println("&&&&&&&&&&&&");

        //b) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
        //@@@@@

        x = 5;
        y = 8;

        System.out.println("===========LETRA B========");

        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@@@@");
            } else {
                System.out.println("#############");
                System.out.println("$$$$$$$$$$");
                System.out.println("&&&&&&&&&&&&");
            }
        }

        //c) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
        //@@@@@

        x = 5;
        y = 8;

        System.out.println("===========LETRA C========");

        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@@@@");
            } else {
                System.out.println("#############");
            }
        } else {
            System.out.println("$$$$$$$$$$");
            System.out.println("&&&&&&&&&&&&");
        }

        //d) Supondo que x = 5 e y = 7, a seguinte saída é produzida. [Observação: todas as três últimas instruções de saída depois do else são
        //partes de um bloco].
        //#####
        //$$$$$
        //&&&&&

        x = 5;
        y = 7;

        System.out.println("===========LETRA D========");

        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@@@@");
            }
        } else {
            System.out.println("#############");
            System.out.println("$$$$$$$$$$");
            System.out.println("&&&&&&&&&&&&");
        }



    }
}
