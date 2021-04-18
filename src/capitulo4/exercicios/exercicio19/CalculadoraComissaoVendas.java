package capitulo4.exercicios.exercicio19;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class CalculadoraComissaoVendas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int qtdeItem1;
        int qtdeItem2;
        int qtdeItem3;
        int qtdeItem4;
        double valorTotalVendas = 0.0;
        int contador = 1;

        while(contador == 1) {
            System.out.print("Quantidade vendida do item 1: ");
            qtdeItem1 = sc.nextInt();
            valorTotalVendas += qtdeItem1 * 239.99;
            System.out.print("Quantidade vendida do item 2: ");
            qtdeItem2 = sc.nextInt();
            valorTotalVendas += qtdeItem2 * 129.75;
            System.out.print("Quantidade vendida do item 3: ");
            qtdeItem3 = sc.nextInt();
            valorTotalVendas += qtdeItem3 * 99.95;
            System.out.print("Quantidade vendida do item 4: ");
            qtdeItem4 = sc.nextInt();
            valorTotalVendas += qtdeItem4 * 350.89;

            double comissaoSemana = 200.00 + valorTotalVendas * 0.09;
            System.out.printf("Comissão recebida durante a semana: R$%.2f%n", comissaoSemana);
            System.out.println();

            System.out.print("Digite 1 para calcular a comissão do próximo vendedor ou -1 para sair: ");
            contador = sc.nextInt();
        }
    }
}
