package com.imooc.genericHomeWork;


public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    @Override
    public void playGame() {
        System.out.println("小狗" + getName() + "在做游戏！");
    }
}
