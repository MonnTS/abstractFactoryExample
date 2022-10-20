package designpatterns.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("Starting abstract factory...");
        IAnimalFactory factory = FactoryProvider.getAnimalFactory("wild");
        IDog dog = factory.getDog();
        ITiger tiger = factory.getTiger();
        dog.aboutMe();
        tiger.aboutMe();
        System.out.println("********************************");
        factory = FactoryProvider.getAnimalFactory("home");
        dog = factory.getDog();
        tiger = factory.getTiger();
        dog.aboutMe();
        tiger.aboutMe();
    }
}
