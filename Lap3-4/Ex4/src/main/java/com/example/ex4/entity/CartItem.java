package com.example.ex4.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class CartItem {
    private String partNumber;
    private String modelDescription;
    private int quantity;
    private double unitCost;
    private double totalCost;

    public String getPartNumber() {
        return partNumber;
    }

    public String getModelDescription() {
        return modelDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public CartItem(String partNumber, String modelDescription, int quantity, double unitCost, double totalCost) {
        this.partNumber = partNumber;
        this.modelDescription = modelDescription;
        this.quantity = quantity;
        this.unitCost = unitCost;
        this.totalCost = totalCost;
    }

    public CartItem() {
    }
}
