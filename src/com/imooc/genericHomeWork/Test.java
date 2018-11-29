package com.imooc.genericHomeWork;


import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        //定义Dog相关的List
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("巴迪"));
        dogs.add(new Dog("豆豆"));

        //定义Cat相关的List
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("花花"));
        cats.add(new Cat("凡凡"));

        AnimalPlay animalPlay = new AnimalPlay();
        animalPlay.animalPlay(dogs);
        animalPlay.animalPlay(cats);
    }
}
