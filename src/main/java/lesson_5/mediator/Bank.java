package lesson_5.mediator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Bank implements FinancialInstitution {
    private final String OPEN_ACCOUNT = "open an account";
    private final String TAKE_LOAN = "take a loan";

    private List<BankClient> clients;
    private String titleBank;

    public Bank(String titleBank) {
        this.titleBank = titleBank;
        this.clients = new LinkedList<>();
    }

    private void addClient(BankClient... client){
        clients.addAll(Arrays.asList(client));
    }

    @Override
    public String contact(BankClient client, String typeOperation) {
        String request = null;
        if (client instanceof Person){
            switch (typeOperation){
                case TAKE_LOAN:
                    request = "Выдан кредит на сумму 500 000 под 15% в банке" + titleBank;
                    break;
                case OPEN_ACCOUNT:
                    request = "Открыт счет для частного лица в банке" + titleBank;
                    break;
            }
        } else if (client instanceof BigBusiness){
            switch (typeOperation){
                case TAKE_LOAN:
                    request = "Выдан кредит на сумму 50 000 000 под 5% в банке " + titleBank;
                break;
                case OPEN_ACCOUNT:
                    request = "Открыт счет для крупного бизнеса в банке" + titleBank;
                break;
            }
        } else if (client instanceof SmallBusiness){
            switch (typeOperation){
                case TAKE_LOAN:
                    request = "Выдан кредит на сумму 5 000 000 под 10% в банке" + titleBank;
                break;
                case OPEN_ACCOUNT:
                    request = "Открыт счет для малого бизнеса в банке" + titleBank;
                break;
            }
        }
        return request;
    }
}
