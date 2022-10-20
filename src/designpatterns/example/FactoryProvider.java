package designpatterns.example;

public class FactoryProvider {
    private FactoryProvider() {
    }

    public static IAnimalFactory getAnimalFactory(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name must not be null");
        }

        if (name.equalsIgnoreCase("wild")) {
            return new WildAnimalFactory();
        } else if (name.equalsIgnoreCase("home")) {
            return new HomeAnimalFactory();
        }

        return null;
    }
}
