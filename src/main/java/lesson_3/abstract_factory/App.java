package lesson_3.abstract_factory;

public class App {
    public static void main(String[] args) {
        Producer producer  = getProducer("Phone");
        producer.createProducts();
    }

    public static Producer getProducer(String productType){
        if (productType.startsWith("TV")){
            return new Producer(new TVFactory());
        } else {
            return new Producer(new MobilePhoneFactory());
        }
    }
}
