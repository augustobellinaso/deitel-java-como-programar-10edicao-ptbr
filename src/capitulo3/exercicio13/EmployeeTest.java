package capitulo3.exercicio13;

/**
 * @author augustobellinaso
 */
public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee("Augusto", "Bellinaso", 500.0);
        Employee e2 = new Employee("Maria", "Joaquina", 1000.0);

        System.out.println("Salário anual de '" + e1.getNome() + "' = " + e1.getSalarioAnual());
        System.out.println("Salário anual de '" + e2.getNome() + "' = " + e2.getSalarioAnual());

        //Dando aumento de 10% para cada empregado
        e1.setSalarioMensal(e1.getSalarioMensal() * 1.1);
        e2.setSalarioMensal(e2.getSalarioMensal() * 1.1);

        //salários após o aumento
        System.out.println("Salário anual com aumento de 10% mensal de '" + e1.getNome() + "' = " + e1.getSalarioAnual());
        System.out.println("Salário anual com aumento de 10% mensal de '" + e2.getNome() + "' = " + e2.getSalarioAnual());
    }
}
