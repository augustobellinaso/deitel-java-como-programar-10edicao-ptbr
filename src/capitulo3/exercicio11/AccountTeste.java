package capitulo3.exercicio11;

/**
 * @author Augusto Loose Bellinaso
 */
public class AccountTeste {

    public static void main(String[] args) {

        //instanciando um objeto Account
        Account c1 = new Account("Augusto", -1);
        System.out.println("Saldo quando conta foi criada: " + c1.getBalance());
        c1.deposit(100);
        System.out.println("Saldo depois de depositar 100: " + c1.getBalance());

        //fazendo um saque
        c1.withdrawal(50);
        System.out.println("Saldo após sacar 50: " + c1.getBalance());

        //Tentando sacar mais do que o meu saldo
        c1.withdrawal(100);
        System.out.println("Saldo final: " + c1.getBalance());

    }
}
