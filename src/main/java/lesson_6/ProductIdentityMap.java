package lesson_6;

import java.util.HashMap;
import java.util.Map;

public class ProductIdentityMap {
    private Map<Integer, Product> products;
    private static ProductIdentityMap instance;

    private ProductIdentityMap() {
        this.products = new HashMap<>();
    }

    public static ProductIdentityMap getInstance(){
        if (instance == null){
            instance = new ProductIdentityMap();
        }
        return instance;
    }

    public void addProduct(int id, Product product){
        products.put(id, product);
    }

    public boolean isContainProduct(int id) {
        return products.containsKey(id);
    }

    public Product getProduct(int id){
        return products.get(id);
    }
}
