package capitulo5.exercicios.exercicio30;

public class AutoPolicyTest {

    public static void main(String[] args) {
        AutoPolicy p1 = new AutoPolicy(111111, "Toyota", "NJ");
        AutoPolicy p2 = new AutoPolicy(22222, "Ford", "ME");
        AutoPolicy p3 = new AutoPolicy(22222, "Ford", "RS");

        policyNoFaultState(p1);
        policyNoFaultState(p2);
        policyNoFaultState(p3);

    }

    public static void policyNoFaultState(AutoPolicy policy) {
        System.out.println("The auto policy:");
        System.out.printf("Account #: %d; Car: %s; State: %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
                (policy.isNoFaultState() ? "is" : "is not"));
    }
}
