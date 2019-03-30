package com.imooc.genericHomeWork;


public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void playGame() {
        System.out.println("小猫" + getName() + "在做游戏！");
    }
}
