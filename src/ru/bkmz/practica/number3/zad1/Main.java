package ru.bkmz.practica.number3.zad1;

import java.math.BigDecimal;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Pi*r^2
        Double PI = Math.PI ,r = Double.valueOf(3);
        BigDecimal bigDecimal = new BigDecimal(Math.PI);
        bigDecimal = bigDecimal.multiply(BigDecimal.valueOf(Math.pow(r,2)));
        System.out.println(bigDecimal.toString());
    }
}
