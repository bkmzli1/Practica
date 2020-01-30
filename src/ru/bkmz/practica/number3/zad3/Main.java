package ru.bkmz.practica.number3.zad3;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BigDecimal far;
        Scanner scn =  new Scanner(System.in);
        far = new BigDecimal(9);
        far = far.divide(BigDecimal.valueOf(5));
        far = far.multiply(scn.nextBigDecimal());
        far = far.add(BigDecimal.valueOf(32));
        System.out.println(far.toString());

    }
}
