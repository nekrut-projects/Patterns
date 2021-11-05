package lesson_3.abstract_factory;

public class Producer {
    private Electronics electronic;
    private Accessories accessory;

    public Producer(ProductsFactory factory) {
        this.electronic = factory.getElectronic();
        this.accessory = factory.getAccessory();
    }

    public void createProducts(){
        System.out.printf("На фабрике электроники был произведен товар - %s и аксессуар к нему - %s",
                            electronic.getTitle(), accessory.getTitle());
    }
}
