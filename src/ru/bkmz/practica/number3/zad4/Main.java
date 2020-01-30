package ru.bkmz.practica.number3.zad4;

import java.math.BigDecimal;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        final double FUT = 0.305d;
        BigDecimal decimal = new BigDecimal(FUT);
        Scanner scn = new Scanner(System.in);
        decimal = decimal.multiply(scn.nextBigDecimal());
        System.out.println(decimal);
    }
}
