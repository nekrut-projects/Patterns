package lesson_3.factory_method;

public class Ship implements Transport{
    @Override
    public void delivery(Product product) {
        System.out.println("Доставка " + product.getName() + " осуществляется - кораблем");
    }
}
