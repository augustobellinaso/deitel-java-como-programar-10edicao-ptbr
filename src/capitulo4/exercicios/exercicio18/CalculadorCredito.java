package capitulo4.exercicios.exercicio18;

import java.util.Scanner;

/**
 * @author augustobellinaso
 */
public class CalculadorCredito {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //atributos
        int numeroConta;
        int saldoInicioMes;
        int totalItensCobrados;
        int totalCreditosAplicados;
        int limiteAutorizado;
        int novoSaldo;

        System.out.print("Entre com o número da conta do cliente ou -1 para sair: ");
        numeroConta = sc.nextInt();

        while (numeroConta != -1) {
            //solicitando as informações
            System.out.print("Saldo do cliente no início do mês: ");
            saldoInicioMes = sc.nextInt();
            System.out.print("Total dos itens cobrados no mês: ");
            totalItensCobrados = sc.nextInt();
            System.out.print("Total de créditos aplicados ao cliente no mês: ");
            totalCreditosAplicados = sc.nextInt();
            System.out.print("Limite de crédito do cliente: ");
            limiteAutorizado = sc.nextInt();

            //calculando novo saldo
            novoSaldo = saldoInicioMes + totalItensCobrados - totalCreditosAplicados;

            if (novoSaldo > limiteAutorizado) {
                System.out.println("Limite de crédito excedido!");
            } else {
                System.out.println("Limite de crédito não excedido");
            }

            System.out.println();
            System.out.print("Entre com o número da conta do cliente ou -1 para sair: ");
            numeroConta = sc.nextInt();
        }




    }
}
