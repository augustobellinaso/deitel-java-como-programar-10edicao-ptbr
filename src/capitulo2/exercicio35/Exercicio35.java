package capitulo2.exercicio35;

import java.util.Scanner;

/**
 * @author Augusto Loose Bellinaso
 */
public class Exercicio35 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quilômetros dirigidos por dia: ");
        int kmDia = input.nextInt();
        System.out.print("Preço por litro de gasolina: ");
        double precoLitro = input.nextDouble();
        System.out.print("Quilômetros médios por litro: ");
        double kmMedio = input.nextDouble();
        System.out.print("Taxas de estacionamento por dia: ");
        double taxa = input.nextDouble();
        System.out.print("Pedágio por dia: ");
        double pedagio = input.nextDouble();

        double litrosDia = kmDia / kmMedio;
        double gasolinaDia = litrosDia * precoLitro;
        double custoDia = gasolinaDia + taxa + pedagio;

        System.out.printf("Custo por dia de dirigir para o trabalho do usuário: R$%.2f", custoDia);
    }
}
