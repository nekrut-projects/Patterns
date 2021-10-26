package lesson_3.factory_method;

public interface Product {
//    void delivery();
    enum TypeSize{
        SMALL, MEDIUM, LARGE
    }
    Electronics.TypeSize getSize();
    String getName();
}
