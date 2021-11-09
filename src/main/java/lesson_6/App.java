package lesson_6;

public class App {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        try {
            Product product = productService.findById(2);
        } catch (ResourceNotFoundException e) {
            e.printStackTrace();
        }
    }
}
