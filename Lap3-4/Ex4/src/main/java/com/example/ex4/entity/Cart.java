package com.example.ex4.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Cart {
    private ArrayList<CartItem> cartItems = new ArrayList<>();
    private double orderTotal;

    public void setCartItems(ArrayList<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public ArrayList<CartItem> getCartItems() {
        return cartItems;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public int getLineItemCount() {
        return cartItems.size();
    }

    public void deleteCartItem(String itemIndex) {
        int index = Integer.parseInt(itemIndex);
        cartItems.remove(index);
        calculatoOrderTotal();
    }

    public void updateCartItem(String itemIndex, String quantity) {
        int index = Integer.parseInt(itemIndex);
        int quan = Integer.parseInt(quantity);

        CartItem c =null;
        if (quan >0) {
            c = cartItems.get(index-1);
            c.setQuantity(quan);
            c.setTotalCost(quan * c.getUnitCost());
            calculatoOrderTotal();
        }
    }

    public void addCartItem(CartItem cartItem) {
        cartItems.add(cartItem);
        calculatoOrderTotal();
    }

    public CartItem getCartItem(int itemIndex) {
        CartItem c = null;
        if (cartItems.size() > itemIndex) {
            c = cartItems.get(itemIndex);
        }
        return c;
    }

    protected void calculatoOrderTotal() {
        double total = 0;
        for (int i = 0; i < cartItems.size(); i++) {
            CartItem c = cartItems.get(i);
            total += c.getTotalCost();
        }
        setOrderTotal(total);
    }
}
