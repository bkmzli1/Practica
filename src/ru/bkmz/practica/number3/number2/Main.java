package ru.bkmz.practica.number3.number2;

import java.math.BigDecimal;
import java.util.Scanner;


public class Main {
    public static final double funt = 0.454;

    public static void main(String[] args) {

        BigDecimal kg;
        Scanner scn = new Scanner(System.in);
        kg = scn.nextBigDecimal();
        kg = kg.multiply(BigDecimal.valueOf(funt));
        System.out.println("в кг "+kg.toString());
    }
}
