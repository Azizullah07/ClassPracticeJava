package class21Demo;

import class21Demo.Animal;

public class Cat extends Animal {
    Cat(String name) {
        this.name = name;

    }

    void meow(){
        System.out.println(name + " is meoing ");
    }

    void hunt() {
        System.out.println(name + " is hunting");
    }


    }

