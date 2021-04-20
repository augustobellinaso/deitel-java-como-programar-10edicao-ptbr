package capitulo4.exercicios.exercicio34;

/**
 * @author augustobellinaso
 */
public class InstrucaoErrada {

    public static void main(String[] args) {

        int x = 10;
        int y = 5;
        //Instrução errada
        //System.out.println(++(x + y));
        //não pode incrementar variáveis

        int soma = x + y;
        System.out.println(++soma);
    }
}
