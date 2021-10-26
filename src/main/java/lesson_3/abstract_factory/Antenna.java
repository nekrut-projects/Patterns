package lesson_3.abstract_factory;

public class Antenna implements Accessories{
    private String title;

    public Antenna(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return null;
    }
}
