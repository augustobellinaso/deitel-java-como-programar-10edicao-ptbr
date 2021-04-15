package capitulo3.exercicio12;

/**
 * @author augustobellinaso
 */
public class InvoiceTest {

    public static void main(String[] args) {

        //Instanciando os objetos
        Invoice i1 = new Invoice("1", "Caneta", 10, 2.5);
        Invoice i2 = new Invoice("2", "Lápis", -1, 5.0);
        Invoice i3 = new Invoice("3", "Borracha", 10, -2);
        Invoice i4 = new Invoice("4", "Régua", -10, -2.0);

        System.out.println("Total da fatura 1: " + i1.getInvoiceAmout());
        System.out.println("Total da fatura 2: " + i2.getInvoiceAmout());
        System.out.println("Total da fatura 3: " + i3.getInvoiceAmout());
        System.out.println("Total da fatura 4: " + i4.getInvoiceAmout());
    }
}
