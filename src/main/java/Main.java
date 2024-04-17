import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        classStaticMethodReference();
        System.out.println();
        objectNonStaticMethodReference();
        System.out.println();
        classNonStaticMethodReference();
        System.out.println();
        constructorMethodReference();
    }

    private static void classStaticMethodReference() {
        System.out.println("Class static method reference");

        Runnable printCountRunnable = FoodProduct::printCount;
        printCountRunnable.run();
    }

    private static void objectNonStaticMethodReference() {
        System.out.println("Object non-static method reference");

        FoodProduct foodProduct = new FoodProduct("apple", 2, 0.5, 10, FoodType.FRUIT);
        Supplier<String> toStringSupplier = foodProduct::toString;
        System.out.println(toStringSupplier.get());
    }

    private static void classNonStaticMethodReference() {
        System.out.println("Class non-static method reference");

        Function<FoodProduct, FoodType> foodTypeFunction = FoodProduct::getFoodType;
        FoodType foodType = foodTypeFunction.apply(new FoodProduct("tomato", 2, 0.5, 10, FoodType.VEGETABLE));
        System.out.println(foodType);
    }

    private static void constructorMethodReference() {
        System.out.println("Constructor method reference");

        System.out.print("Without parameters: ");
        Supplier<FoodProduct> withoutParametersConstructorSupplier = FoodProduct::new;
        FoodProduct withoutParametersFoodProduct = withoutParametersConstructorSupplier.get();
        System.out.println(withoutParametersFoodProduct);

        System.out.print("With parameters: ");
        ProductFoodFactory<FoodProduct> withParametersConstructorFactory = FoodProduct::new;
        FoodProduct withParametersFoodProduct = withParametersConstructorFactory.create("pear", 1, 0.5, 10, FoodType.FRUIT);
        System.out.println(withParametersFoodProduct);
    }
}
