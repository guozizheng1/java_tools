package com.imooc.genericHomeWork;


public abstract class Animal {

    private String name;

    public Animal(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void playGame();//模拟小动物做游戏

}
