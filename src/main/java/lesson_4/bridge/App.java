package lesson_4.bridge;

public class App {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setInvoice(new InvoiceToProduct("Samsung A70"));
        shop.paymentCash();
        shop.setInvoice(new InvoiceToProduct("LG G110z"));
        shop.pay();

        TerminalPay terminal = new TerminalPay();
        terminal.setInvoice(new InvoiceToServices("услуги предоставления интернет связи, лицевой счету №675645"));
        terminal.pay();
    }
}
