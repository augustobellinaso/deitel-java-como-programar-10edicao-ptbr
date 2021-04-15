package capitulo3.exercicio16;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class HeartRatesTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.print("Digite o seu dia de nascimento: ");
        int diaNasc = sc.nextInt();
        System.out.print("Digite o seu mês de nascimento: ");
        int mesNasc = sc.nextInt();
        System.out.print("Digite o seu ano de nascimento: ");
        int anoNasc = sc.nextInt();

        //Criando o objeto
        HeartRates hr1 = new HeartRates(nome, sobrenome, diaNasc, mesNasc, anoNasc);

        System.out.println("===========RELATÓRIO DE INFORMAÇÕES===========");
        System.out.println("Nome completo: " + hr1.getNome() + " " + hr1.getSobrenome());
        System.out.println("Data de Nascimento: " + hr1.getDiaNasc() + "/" + hr1.getMesNasc() + "/" + hr1.getAnoNasc());
        System.out.println("IDADE: " + hr1.getIdade());
        System.out.println("FREQUÊNCIA CARDÍACA MÁXIMA: " + hr1.calculaFrequenciaMaxima());
        hr1.calculaFrequenciaAlvo();
        System.out.println("==============================================");



    }
}
