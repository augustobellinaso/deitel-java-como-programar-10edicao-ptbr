package capitulo3.exercicio15;

/**
 * @author Augusto Loose Bellinaso
 */
public class AccountTeste {

    public static void main(String[] args) {

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", - 7.53);

        displayAccount(account1);
        displayAccount(account2);



    }

    public static void displayAccount(Account account) {
        System.out.println(account.getName());
        System.out.println(account.getBalance());
    }
}
