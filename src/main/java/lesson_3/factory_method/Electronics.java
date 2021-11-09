package lesson_3.factory_method;

abstract public class Electronics implements Product {

    private String name;
    private TypeSize size;

    @Override
    public TypeSize getSize() {
        return size;
    }

    @Override
    public String getName() {
        return name;
    }

    protected Electronics(String name, TypeSize size) {
        this.name = name;
        this.size = size;
    }
}
