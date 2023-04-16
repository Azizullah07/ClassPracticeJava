package class21Demo;

import class21Demo.Cat;
import class21Demo.Dog;
import class21Demo.Loin;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog=new Dog("Max");
        dog.run();
        dog.bark();
        dog.eat();


        Cat cat=new Cat("Tom");
        cat.hunt();
        cat.eat();
        cat.meow();


        Loin loin=new Loin("JungLeking");
        loin.roar();
        loin.eat();
        loin.sleep();
    }
}
