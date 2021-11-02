package lesson_4.bridge;

public class Shop implements Payment {
    private Invoice invoice;

    public void setInvoice(Invoice invoice){
        this.invoice = invoice;
    }
    @Override
    public boolean pay() {
        System.out.println("Безналичная оплата");
        System.out.println("Произвести оплату");
        if(invoice.isEnoughMoneyOnAccount()){
            invoice.getInfoFromBank();
            invoice.transferMoney();
            invoice.sendInfoInBank();
            System.out.printf("Оплата %s - прошла успешно!!!\n", invoice.getInfo());
            System.out.println("---------------------------------");
            return true;
        }
        return false;
    }

    public boolean paymentCash(){
        System.out.println("Оплата наличными");
        recalculateMoney();
        if (invoice.sendInfoInBank()){
            System.out.printf("Оплата %s - прошла успешно!!!\n", invoice.getInfo());
            System.out.println("---------------------------------");
            return true;
        }
        return false;
    }

    private void recalculateMoney(){
        System.out.println("Пересчитать деньги");
    }
}
