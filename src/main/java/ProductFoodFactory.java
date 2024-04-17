@FunctionalInterface
public interface ProductFoodFactory<P extends FoodProduct> {

    P create(String name, int quantity, double price, int calories, FoodType foodType);
}
