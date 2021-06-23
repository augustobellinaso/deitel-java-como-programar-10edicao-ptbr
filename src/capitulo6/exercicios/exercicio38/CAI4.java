package capitulo6.exercicios.exercicio38;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class CAI4 {
    public static SecureRandom random = new SecureRandom();
    public static Scanner sc = new Scanner(System.in);
    public static final int PERGUNTAS = 10;

    public static void main(String[] args) {

        int resposta;
        boolean continuar = true;
        int corretas = 0;
        int qtdeRespostas = 0;
        int dificuldade;

        do {

            while (qtdeRespostas <= PERGUNTAS) {

                System.out.print("Níveis de dificuldade: \n" +
                        "1 - números de um dígito \n" +
                        "2 - números de dois dígitos \n" +
                        "3 - números de três dígitos \n" +
                        "Dificuldade da próxima pergunta: ");
                dificuldade = sc.nextInt();
                while(!validarDificuldade(dificuldade)) {
                    System.out.print("Dificuldade inválida. Digite novamente: ");
                    dificuldade = sc.nextInt();
                }

                int num1 = gerarNumero(dificuldade);
                int num2 = gerarNumero(dificuldade);


                gerarPergunta(num1, num2);
                resposta = sc.nextInt();
                qtdeRespostas++;

                while (!validarResposta(num1, num2, resposta)) {
                    int opcaoMensagem = random.nextInt(4);
                    mensagensErro(opcaoMensagem);
                    gerarPergunta(num1, num2);
                    resposta = sc.nextInt();
                    qtdeRespostas++;
                    if (qtdeRespostas == PERGUNTAS) {
                        break;
                    }
                }

                if (validarResposta(num1, num2, resposta)) {
                    int opcaoMensagem = random.nextInt(4);
                    mensagensSucesso(opcaoMensagem);
                    System.out.println();
                    corretas++;
                }

                if (qtdeRespostas == PERGUNTAS) {
                    break;
                }

            }

            if (corretas <= 7) {
                System.out.println();
                System.out.println("==================================");
                System.out.println("Peça ajuda extra ao seu professor!");
                System.out.println("==================================");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("=============================================================");
                System.out.println("Parabéns! Você está pronto para avançar para o próximo nível!");
                System.out.println("=============================================================");
                System.out.println();
            }

            System.out.print("Digite 0 se deseja sair ou 1 para passar ao próximo aluno: ");
            if (sc.nextInt() == 0) {
                continuar = false;
            }
            qtdeRespostas = 0;

        } while (continuar);
    }

    public static int gerarNumero(int dificuldade) {
        int num = 0;

        switch (dificuldade) {
            case 1:
                num = 1 + random.nextInt(10);
                break;
            case 2:
                num = 10 + random.nextInt(90);
                break;
            case 3:
                num = 100 + random.nextInt(900);
                break;
        }
        return num;
    }

    public static void gerarPergunta(int num1, int num2) {
        System.out.printf("Quanto é %d vezes %d? ", num1, num2);
    }

    public static boolean validarResposta(int num1, int num2, int resp) {
        return resp == num1 * num2;
    }

    public static boolean validarDificuldade(int dificuldade) {
        return dificuldade >= 1 && dificuldade <= 3;
    }

    public static void mensagensSucesso(int opcao) {
        switch (opcao) {
            case 0:
                System.out.println("Muito bom!");
                break;
            case 1:
                System.out.println("Excelente!");
                break;
            case 2:
                System.out.println("Bom trabalho!");
                break;
            case 3:
                System.out.println("Mantenha um bom trabalho!");
                break;
        }
    }

    public static void mensagensErro(int opcao) {
        switch (opcao) {
            case 0:
                System.out.println("Não. Por favor, tente novamente.");
                break;
            case 1:
                System.out.println("Errado. Tente mais uma vez.");
                break;
            case 2:
                System.out.println("Não desista!");
                break;
            case 3:
                System.out.println("Não. Continue tentando.");
                break;
        }
    }
}
