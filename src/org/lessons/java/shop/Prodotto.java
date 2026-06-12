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

    // nuove variabili d istanza
    private int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva2;

    Random rand = new Random();

    public Prodotto(String name, String description, BigDecimal price, BigDecimal iva) {
        this.code = rand.nextInt(99999);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;

    }

    // Incapsulamento
    public Prodotto() {
        this.codice = rand.nextInt(99999);
        this.nome = "nome";
        this.marca = "marca";
        this.prezzo = new BigDecimal(300);
        this.iva2 = new BigDecimal(0.22);
    }

    public Prodotto(BigDecimal iva2, String nome, String marca, BigDecimal prezzo) {
        this.codice = rand.nextInt(99999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva2 = iva2;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (this.nome != null) {
            this.nome = nome;
        }
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
