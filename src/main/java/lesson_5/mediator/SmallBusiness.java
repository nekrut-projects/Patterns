package lesson_5.mediator;

public class SmallBusiness implements BankClient{
    private String title;
    private FinancialInstitution financialInstitution;

    public SmallBusiness(FinancialInstitution consultantBank, String title) {
        this.title = title;
        this.financialInstitution = consultantBank;
    }

    @Override
    public void openAccount() {
        System.out.println(financialInstitution.contact(this, "open an account"));
    }

    @Override
    public void takeLoan() {
        System.out.println(financialInstitution.contact(this, "take a loan"));
    }

    public void setFinancialInstitution(FinancialInstitution financialInstitution) {
        this.financialInstitution = financialInstitution;
    }
}
