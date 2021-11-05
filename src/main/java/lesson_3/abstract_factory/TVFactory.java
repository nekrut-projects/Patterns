package lesson_3.abstract_factory;

public class TVFactory implements ProductsFactory{
    @Override
    public Electronics getElectronic() {
        return new TV("TV Samsung HJ7564");
    }

    @Override
    public Accessories getAccessory() {
        return new Antenna("Antenna UY7865h");
    }
}
