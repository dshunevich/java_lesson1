package com.dshunevich.lesson1.animals;

public abstract class Animal {

    // private - доступ возможем только из этого класса
    // default - из этого класса +из любого класса из пакета в котором лежит код
    // protected - внутри класса от private
    //      +внутри пакета от default
    //      +любой наследник этого класса где бы он ни находился
    // public - максимально возможный уровень доступа, доступ к этому полю будут иметь
    //      +абсолютно все откуда угодно
    protected String name;
    protected String color;
    protected int age;

    //public Animal(){}

    public Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void info(){
        System.out.println(name + " " + color + " " + age);
    }

    public abstract void voice();

}
