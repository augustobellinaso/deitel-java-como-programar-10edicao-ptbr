package capitulo5.exercicios.exercicio28;

/**
 * @author augustobellinaso 
 */
public class RemoverContinue {

    public static void main(String[] args) {
        
        for (int count = 1; count <= 10; count++) {

            if (count == 5) {
                count++;
            }

            System.out.printf("%d ", count);
        }

        System.out.printf("%nUsamos continue para não imprimir 5");
    }
}
