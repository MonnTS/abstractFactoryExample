package designpatterns.example;

public class WildAnimalFactory implements IAnimalFactory {
    @Override
    public IDog getDog() {
        return new WildDog();
    }

    @Override
    public ITiger getTiger() {
        return new WildTiger();
    }
}
