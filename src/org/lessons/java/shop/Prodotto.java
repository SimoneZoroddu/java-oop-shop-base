package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    int code;
    String name;
    String description;
    float price;
    int iva;

    Random rand = new Random();

    public Prodotto(String name, String description, float price, int iva) {
        this.code = rand.nextInt(50);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;

    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void stampPrice() {
        System.out.println(this.price);
    }

    public float getPriceWithIva() {
        return this.price + ((this.price * this.iva) / 100);
    }

    public String getNameExtension() {
        return code + "-" + name;
    }
}
