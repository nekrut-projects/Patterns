package lesson_4.bridge;

public interface Invoice {
    String getInfo();
    String getInfoFromBank();
    boolean sendInfoInBank();
    boolean transferMoney();
    boolean isEnoughMoneyOnAccount();

}
