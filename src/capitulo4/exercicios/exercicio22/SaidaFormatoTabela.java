package capitulo4.exercicios.exercicio22;

/**
 * @author augustobellinaso
 */
public class SaidaFormatoTabela {

    public static void main(String[] args) {

        //imprimindo o título da tabela

        System.out.println("N \t\t 10 * N \t 100 * N \t 1000 * N");
        int n = 1;
        System.out.println();
        while(n <= 10) {
            System.out.println(n + "\t\t" + (10 * n) + "\t\t\t" + (100 * n) + "\t\t\t" + (1000 * n));
            n++;
        }
    }
}
