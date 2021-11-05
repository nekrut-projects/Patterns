package lesson_3.factory_method;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LogisticsApp {
    public static void main(String[] args) {

        for (Product p : getProducts()){
            Transport transport = getTransport(p);
            transport.delivery(p);
        }

    }

    private static Transport getTransport(Product product){
        switch (product.getSize()){
            case SMALL:     return new Airplane();
            case MEDIUM:    return new Truck();
            case LARGE:     return new Ship();
        }
        return null;
    }

    private static List<Product> getProducts(){
        return Arrays.asList(new Product[] {
                new MobilePhone("Samsung A10", Product.TypeSize.SMALL),
                new Fridge("LG G679b", Product.TypeSize.LARGE),
                new TV("Philips HR7843", Product.TypeSize.MEDIUM),
                new MobilePhone("Samsung S10", Product.TypeSize.SMALL),
                new MobilePhone("Apple 8", Product.TypeSize.SMALL)
        });
    }
}
