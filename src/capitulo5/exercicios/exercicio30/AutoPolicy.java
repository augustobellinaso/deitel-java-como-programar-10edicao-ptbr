package capitulo5.exercicios.exercicio30;

public class AutoPolicy {

    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isNoFaultState() {
        boolean noFaultState = false;

        if (getState().equals("CT") || getState().equals("MA") || getState().equals("ME") ||
                getState().equals("NH") || getState().equals("NJ") || getState().equals("NY") || getState().equals("PA") ||
                getState().equals("VT")) {

            switch (getState()) {
                case "MA":
                case "NJ":
                case "NY":
                case "PA":
                    noFaultState = true;
                    break;
                default:
                    noFaultState = false;
                    break;
            }

        } else {
            System.out.println("Código de estado inválido!");
        }
        
        return noFaultState;

    }
    
}
