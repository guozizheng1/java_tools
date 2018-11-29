package com.imooc.genericHomeWork;


import java.util.List;

public class AnimalPlay {
    public void animalPlay(List<? extends Animal> animals){
        for(Animal animal: animals){
            animal.playGame();
        }
    }
}
