package lesson_3.factory_method;

public class TV extends Electronics{
    protected TV(String name, TypeSize size) {
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
