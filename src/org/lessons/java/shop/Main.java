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

        Prodotto computer = new Prodotto(new BigDecimal(0.22), "LOQ Notebook 15", "Lenovo", new BigDecimal(3000));

        System.out.println(computer.getNome());
        computer.setNome("LOQ Notebook 14");
        System.out.println(computer.getNome());
        
        Prodotto base = new Prodotto();
        
        System.out.println(base.getNome());
        base.setNome("Nuovo Nome");
        System.out.println(base.getNome());
    }
}
