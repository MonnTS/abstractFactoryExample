package designpatterns.example;

public class HomeAnimalFactory implements IAnimalFactory {
    @Override
    public IDog getDog() {
        return new HomeDog();
    }

    @Override
    public ITiger getTiger() {
        return new HomeTiger();
    }
}
