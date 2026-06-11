package org.lessons.java.shop;

import java.util.Random;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {

    public int code;
    public String name;
    public String description;
    public BigDecimal price;
    public BigDecimal iva;

    Random rand = new Random();

    public Prodotto(String name, String description, BigDecimal price, BigDecimal iva) {
        this.code = rand.nextInt(99999);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;

    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrezzoBase() {
        return this.price;
    }

    public BigDecimal getPriceWithIva() {
        if (price != null && iva != null) {
            // verifica che sia inizializzata la variabile di istanza
            return price.add(price.multiply(iva).setScale(2, RoundingMode.DOWN));
        }
        return null;
    }

    public String getNameExtension() {
        if (name != null) {
            return code + "-" + name;
        }
        return null;
    }
}
