package com.dshunevich.lesson1;

import com.dshunevich.lesson1.animals.Animal;
import com.dshunevich.lesson1.animals.Cat;
import com.dshunevich.lesson1.animals.Dog;

public class MainApp {
    public static void main(String[] args) {

        /*
        Cat cat = new Cat("Barsik", "Black", 2);
        Cat cat2 = new Cat("Murzik", "White", 3);

        cat.info();
        cat2.info();

        Animal[] catsAndDogs = {
            new Cat("Mur", "Black", 2),
            new Dog("Bobik", "White", 3),
        };
        for (Animal o: catsAndDogs){
            o.voice();
            System.out.println(o);
        }
        */


        Box box1 = new Box("Green", 1);
        Box box2 = new Box("Blue", 2);
        System.out.println(box1.equals(box2));



    }
}
