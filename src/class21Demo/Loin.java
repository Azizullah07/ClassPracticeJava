package class21Demo;

import class21Demo.Animal;

public class Loin extends Animal {
    Loin(String name) {
        this.name = name;
    }
    void roar(){
        System.out.println(name+" is roaring");
    }

}