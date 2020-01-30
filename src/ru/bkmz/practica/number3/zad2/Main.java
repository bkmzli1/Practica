package ru.bkmz.practica.number3.zad2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        double km = 14d, min = 45d, sek = 30d,cah,mc;
        BigDecimal  mil;
        mil = new BigDecimal(km);
        mil = mil.divide(BigDecimal.valueOf(1.6));

        cah = ((sek / 60d) + min)/60d;
        mc = Double.valueOf(mil.toString()) / cah;
        System.out.println(mc);


    }
}
