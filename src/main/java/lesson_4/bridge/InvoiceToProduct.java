package lesson_4.bridge;

public class InvoiceToProduct implements Invoice{
    private String title;

    public InvoiceToProduct(String title) {
        this.title = title;
    }

    @Override
    public String getInfo() {
        return title;
    }

    @Override
    public String getInfoFromBank() {
        return null;
    }

    @Override
    public boolean sendInfoInBank() {
        System.out.println("Товар оплачен");
        return true;
    }

    @Override
    public boolean transferMoney() {
        return false;
    }

    @Override
    public boolean isEnoughMoneyOnAccount() {
        return true;
    }

}
