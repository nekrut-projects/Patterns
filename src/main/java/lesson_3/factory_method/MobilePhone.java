package lesson_3.factory_method;

public class MobilePhone extends Electronics{
    protected MobilePhone(String name, TypeSize size) {
        super(name, size);
    }

    @Override
    public TypeSize getSize() {
        return super.getSize();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
