package com.example.ex4.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private static final List<Product> list = new ArrayList<>();
    static {
        initData();
    }

    public static List<Product> queryProducts(){
        return list;
    }

    private static void initData(){
        Product p = new Product();
        p.setId("PRO001");
        p.setDescription("");
        p.setPrice(90000);
        p.setModel("Nokia");
        p.setQuantity(10);
        p.setImgUrl("abcxyz");
        list.add(p);

        p = new Product();
        p.setId("PRO002");
        p.setDescription("");
        p.setPrice(90000);
        p.setModel("Samsung");
        p.setQuantity(10);
        p.setImgUrl("abcxyz");
        list.add(p);

        p = new Product();
        p.setId("PRO003");
        p.setDescription("");
        p.setPrice(90000);
        p.setModel("Apple");
        p.setQuantity(10);
        p.setImgUrl("abcxyz");
        list.add(p);

        p = new Product();
        p.setId("PRO004");
        p.setDescription("");
        p.setPrice(90000);
        p.setModel("Xiaomi");
        p.setQuantity(10);
        p.setImgUrl("abcxyz");
        list.add(p);
    }
}
