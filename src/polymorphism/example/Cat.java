package polymorphism.example;

import abstraction.interface_.Flyable;

public class Cat extends Animal implements Flyable {
    @Override
    public void tiengKeu() {
        System.out.println("Meo meo");
    }

    public void batChuot(){
        System.out.println("bat chuot");
    }

    @Override
    public void fly() {
        System.out.println("cat fly");
    }
}
