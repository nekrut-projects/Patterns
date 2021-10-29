package lesson_4.adapter;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        WalletRUB walletRUB = new WalletRUB(5645.35);
        Metal metal = new Gold(56);
        ConverterMetalToMoney converter = new ConverterMetalToMoney(metal);
        System.out.println("Сумма на счете: " + walletRUB.getMoney());
        walletRUB.topUpAccount(converter.getMoney());
        System.out.println("Сумма на счете: " + walletRUB.getMoney());

    }
}
