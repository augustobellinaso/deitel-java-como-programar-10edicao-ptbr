package capitulo5.exercicios.exercicio17;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class CalculandoVendas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int qtdeProd;
        double valorTotal = 0.0;

        System.out.print("CÓDIGO \t PRODUTO \t PREÇO (un)\n" +
                "1 - \t Produto 1 \t 2.98\n" +
                "2 - \t Produto 2 \t 4.50\n" +
                "3 - \t Produto 3 \t 9.98\n" +
                "4 - \t Produto 4 \t 4.49\n" +
                "5 - \t Produto 5 \t 6.87\n" +
                "********************************\n" +
                "Digite o código do produto ou -1 para sair: ");
        int codigo = sc.nextInt();
        while(codigo != -1) {
            System.out.printf("Quantidade vendida do produto %d: ", codigo);
            qtdeProd = sc.nextInt();

            switch (codigo) {
                case 1:
                    valorTotal += qtdeProd * 2.98;
                    break;
                case 2:
                    valorTotal += qtdeProd * 4.50;
                    break;
                case 3:
                    valorTotal += qtdeProd * 9.98;
                    break;
                case 4:
                    valorTotal += qtdeProd * 4.49;
                    break;
                case 5:
                    valorTotal += qtdeProd * 6.87;
                    break;
            }

            System.out.print("Digite o código do produto ou -1 para sair: ");
            codigo = sc.nextInt();
        }

        System.out.printf("Valor total da venda dos itens: R$%.2f", valorTotal);

    }
}
