package capitulo5.exercicios.exercicio26;

/**
 * @author augustobellinaso
 */
public class RemoverBreak {

    public static void main(String[] args) {

        int count;
        boolean sair = false;
        int saida = 0;

        for (count = 1; (count <= 10 && !sair); count++) {

            if (count == 5) {
                saida = count;
                sair = true;
                count = 10;
            }

            System.out.printf("%d ", count);

        }

        System.out.printf("%nSaiu do loop com a variável count = %d", saida);
    }
}
