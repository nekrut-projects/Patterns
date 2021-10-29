package lesson_4.adapter;

import java.math.BigDecimal;

public class WalletRUB implements Wallet {
    private BigDecimal quantity;

    public WalletRUB(double quantity) {
        this.quantity = BigDecimal.valueOf(quantity);
    }

    @Override
    public BigDecimal getMoney() {
        return quantity;
    }

    public void topUpAccount(BigDecimal money) {
        quantity = quantity.add(money);
    }
}
