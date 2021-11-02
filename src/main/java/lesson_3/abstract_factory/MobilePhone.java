package lesson_3.abstract_factory;


public class MobilePhone implements Electronics {
    private String title;

    public MobilePhone(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void turnOn() {
        System.out.println("Телефон - включен");
    }
}
