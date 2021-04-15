package capitulo3.exercicio17;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class HealthProfileTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.print("Digite o sexo ('M', 'F' ou 'O'): ");
        char sexo = sc.next().charAt(0);
        System.out.print("Digite o dia de nascimento: ");
        int dia = sc.nextInt();
        System.out.print("Digite o mês de nascimento: ");
        int mes = sc.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        int ano = sc.nextInt();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();


        HealthProfile hp = new HealthProfile(nome, sobrenome, sexo, dia, mes, ano, altura, peso);


        System.out.println("================PERFIL DE SAÚDE==================");
        System.out.println("NOME COMPLETO: " + hp.getNome() + " " + hp.getSobrenome());
        System.out.println("SEXO: " + hp.getSexo());
        System.out.println("DATA DE NASCIMENTO: " + hp.exibeDataNascimento());
        System.out.printf("ALTURA: %.2fm%n", hp.getAltura());
        System.out.printf("PESO: %.2fkg%n",hp.getPeso());
        System.out.println("IDADE: " + hp.getIdade());
        System.out.printf("IMC: %.2f%s%n", hp.calculaIMC(), "%");
        System.out.println("FREQUÊNCIA CARDÍACA MÁXIMA: " + hp.calculaFrequenciaMaxima());
        System.out.println("FREQUÊNCIA CARDÍACA ALVO: " + hp.calculaFrequenciaAlvo());
        System.out.println("==================================================");
        System.out.println("TABELA DE REFERÊNCIA PARA O IMC");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");


    }
}
