package designpatterns.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("Starting abstract factory...");
        IAnimalFactory animalFactory = FactoryProvider.getAnimalFactory("wild");
        IDog dog = animalFactory.getDog();
        ITiger tiger = animalFactory.getTiger();
        dog.aboutMe();
        tiger.aboutMe();
        System.out.println("********************************");
        animalFactory = FactoryProvider.getAnimalFactory("home");
        dog = animalFactory.getDog();
        tiger = animalFactory.getTiger();
        dog.aboutMe();
        tiger.aboutMe();
    }
}
