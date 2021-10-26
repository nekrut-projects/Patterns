package lesson_3.abstract_factory;

public class MobilePhoneFactory implements ProductsFactory{
    @Override
    public Electronics getElectronic() {
        return new MobilePhone("Mobile phone Samsung A60");
    }

    @Override
    public Accessories getAccessory() {
        return new Case("Case for Samsung A60 red");
    }
}
