package com.pojo;

public class Product {
    private int  id;
    private String name;
    private double price;
    private String detail;

    public Product(int id, String name, double price, String detail) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", detail='" + detail + '\'' +
                '}';
    }
}
