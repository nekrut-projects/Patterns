package lesson_4.adapter;

import java.math.BigDecimal;

public class ConverterMetalToMoney implements Wallet{
    private BigDecimal RUB_PER_GRAM_GOLD = BigDecimal.valueOf(2101.15);
    private Metal metal;

    public ConverterMetalToMoney(Metal metal) {
        this.metal = metal;
    }

    @Override
    public BigDecimal getMoney() {
        return RUB_PER_GRAM_GOLD.multiply(BigDecimal.valueOf(metal.getWeight()));
    }
}
