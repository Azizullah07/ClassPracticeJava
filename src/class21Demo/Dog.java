package class21Demo;

import class21Demo.Animal;

public class Dog extends Animal {
    Dog (String name){
        this.name=name;

    }
void bark(){
        System.out.println(name+ " is barking");
}
void run(){
        System.out.println(name+ " is runing");
}
}
