package designpatterns.example;

public class HomeDog implements IDog {
    @Override
    public void aboutMe() {
        System.out.println("I am not a wild dog!");
    }
}
