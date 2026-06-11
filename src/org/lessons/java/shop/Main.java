package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto penna = new Prodotto(
                "Bic",
                "di colore molto verde",
                new BigDecimal(100),
                new BigDecimal(0.22));

        System.out.println(penna.getNameExtension());
        System.out.println(penna.getPrezzoBase());
        System.out.println(penna.getPriceWithIva());
        penna.setPrice(new BigDecimal(35));
        System.out.println(penna.getPrezzoBase());
        System.out.println(penna.getPriceWithIva());

    }
}
