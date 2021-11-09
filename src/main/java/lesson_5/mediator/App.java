package lesson_5.mediator;

public class App {
    public static void main(String[] args) {
        Bank sber = new Bank("ПАО \"Сбербанк\"");
        Bank uralSib = new Bank("ПАО \"БАНК УРАЛСИБ\"");

        SmallBusiness ip = new SmallBusiness(sber, "ИП Иванов");
        Person person = new Person(sber, "Смирнов И. И.");
        BigBusiness organisation = new BigBusiness(sber, "ОАО \"Рога и копыта\"");

        System.out.println("------------------------------------");
        ip.openAccount();
        ip.takeLoan();
        System.out.println("------------------------------------");
        person.openAccount();
        person.takeLoan();
        System.out.println("------------------------------------");
        organisation.openAccount();
        organisation.takeLoan();

        ip.setFinancialInstitution(uralSib);
        person.setFinancialInstitution(uralSib);
        organisation.setFinancialInstitution(uralSib);

        System.out.println("*************************************");
        ip.openAccount();
        ip.takeLoan();
        System.out.println("------------------------------------");
        person.openAccount();
        person.takeLoan();
        System.out.println("------------------------------------");
        organisation.openAccount();
        organisation.takeLoan();
        System.out.println("------------------------------------");

    }
}
