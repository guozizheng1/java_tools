package com.imooc.generic;


import java.util.ArrayList;
import java.util.List;

public class GoodsTest {

    public static void main(String[] args){
        //定义Book相关的list
        List<Book> books = new ArrayList<>();
        books.add(new Book());
        books.add(new Book());

        //定义Clothes相关的List
        List<Clothes> clothes = new ArrayList<>();
        clothes.add(new Clothes());
        clothes.add(new Clothes());

        //定义shoes相关的List
        List<Shoes> shoes = new ArrayList<>();
        shoes.add(new Shoes());
        shoes.add(new Shoes());

        GoodsSeller goodsSeller = new GoodsSeller();
        goodsSeller.sellGoods(books);
        goodsSeller.sellGoods(clothes);
        goodsSeller.sellGoods(shoes);

    }
}
