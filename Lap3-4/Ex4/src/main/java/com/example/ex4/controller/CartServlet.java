package com.example.ex4.controller;

import com.example.ex4.entity.Cart;
import com.example.ex4.entity.CartItem;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "CartServlet", value = "/CartServlet")
public class CartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String strAction = request.getParameter("action");

        if (strAction != null && !strAction.equals("")) {
            switch (strAction) {
                case "Add":
                    addToCart(request);
                case "Update":
                    updateCart(request);
                case "Delete":
                    deleteCart(request);
                default:
                    break;
            }
        }
        response.sendRedirect("ShoppingCart.jsp");
    }

    protected void deleteCart(HttpServletRequest req) {
        HttpSession session = req.getSession();
        String index = req.getParameter("itemIndex");
        Cart cart = null;

        Object objCart = session.getAttribute("cart");
        if (cart != null)
            cart = (Cart) objCart;
        else
            cart = new Cart();
        cart.deleteCartItem(index);
    }

    protected void updateCart(HttpServletRequest req) {
        HttpSession session = req.getSession();
        String quantity = req.getParameter("quantity");
        String index = req.getParameter("itemIndex");

        Cart cart = null;
        Object objCart = session.getAttribute("cart");
        if (cart != null)
            cart = (Cart) objCart;
        else
            cart = new Cart();
        cart.updateCartItem(index,quantity);
    }

    protected void addToCart(HttpServletRequest req) {
        HttpSession session = req.getSession();
        CartItem cartItem = new CartItem();
        cartItem.setQuantity(Integer.parseInt(req.getParameter("quantity")));
        cartItem.setPartNumber(req.getParameter("modelNo"));
        cartItem.setModelDescription(req.getParameter("description"));
        cartItem.setUnitCost(Double.parseDouble(req.getParameter("price")));

        Cart cart = null;
        Object objCart = session.getAttribute("cart");
        if (cart != null)
            cart = (Cart) objCart;
        else
            cart = new Cart();
        cart.addCartItem(cartItem);
    }
}
