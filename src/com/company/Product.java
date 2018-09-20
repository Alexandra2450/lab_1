package com.company;
import  java.io.Serializable;

import java.util.Objects;

public class Product implements Serializable{
    private int id_product;
    private int id_customer;
    private double cost;
    private String name_product;

    public Product(int id_product) {
    }

    public Product(int id_product, int id_customer, double cost, String name_product) {
        this.id_product = id_product;
        this.id_customer = id_customer;
        this.cost = cost;
        this.name_product = name_product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return getId_product() == product.getId_product() &&
                getId_customer() == product.getId_customer() &&
                Double.compare(product.getCost(), getCost()) == 0 &&
                Objects.equals(getName_product(), product.getName_product());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId_product(), getId_customer(), getCost(), getName_product());
    }

    @Override
    public String toString() {
        return "Product{" +
                "id_product=" + id_product +
                ", id_customer=" + id_customer +
                ", cost=" + cost +
                ", name_product='" + name_product + '\'' +
                '}';
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }
}
