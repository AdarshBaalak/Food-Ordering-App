package com.example.foodieshub2.Models;

public class OrderModel {
    int orderImg;
    String soldItem,price,orderNumber;

    public OrderModel(int orderImg, String soldItem, String price, String orderNumber) {
        this.orderImg = orderImg;
        this.soldItem = soldItem;
        this.price = price;
        this.orderNumber = orderNumber;
    }

    public int getOrderImg() {
        return orderImg;
    }

    public String getSoldItem() {
        return soldItem;
    }

    public String getPrice() {
        return price;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderImg(int orderImg) {
        this.orderImg = orderImg;
    }

    public void setSoldItem(String soldItem) {
        this.soldItem = soldItem;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
