package lesson_5.mediator;

public class Person implements BankClient{
    private FinancialInstitution financialInstitution;
    private String title;

    public Person(FinancialInstitution consultantBank, String title) {
        this.financialInstitution = consultantBank;
        this.title = title;
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
