package com.example.ex4.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private String id;
    private String model;
    private String description;
    private String imgUrl;
    private int quantity;
    private double price;

    public Product() {
    }

    public Product(String id, String model, String description, String imgUrl, int quantity, double price) {
        this.id = id;
        this.model = model;
        this.description = description;
        this.imgUrl = imgUrl;
        this.quantity = quantity;
        this.price = price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
