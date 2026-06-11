package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto penna = new Prodotto("Bic", "di colore molto verde", 14.52f, 22);

        System.out.println(penna.getNameExtension());
        penna.stampPrice();
        System.out.println(penna.getPriceWithIva());
        penna.setPrice(30);
        penna.stampPrice();
        System.out.println(penna.getPriceWithIva());

    }
}
