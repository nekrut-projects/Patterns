package lesson_4.bridge;

public class InvoiceToServices implements Invoice{
    private String title;

    public InvoiceToServices(String title) {
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
        System.out.println("Услуга оплачена");
        return true;
    }

    @Override
    public boolean transferMoney() {
        sendInfoToCompany();
        return true;
    }

    @Override
    public boolean isEnoughMoneyOnAccount() {
        return true;
    }

    public boolean sendInfoToCompany(){
        System.out.println("Информация отправлена");
        return true;
    }
}
