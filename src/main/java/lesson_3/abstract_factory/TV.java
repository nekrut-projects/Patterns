package lesson_3.abstract_factory;


public class TV implements Electronics {
    private String title;

    public TV(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void turnOn() {
        System.out.println("TV - включен");
    }
}
