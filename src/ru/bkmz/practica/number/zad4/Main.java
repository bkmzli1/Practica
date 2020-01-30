package ru.bkmz.practica.number.zad4;

import java.math.BigDecimal;

/**
 * Created by user on 21.01.2020.
 */
public class Main {
    private static double sec = 365d * 24d * 60d * 60d, humen = 312_032_486d;
    private static final double r = sec / 7d, s = sec / 12d, i = sec / 45d;

    public static void main(String[] args) {
        int secR = 0, secS = 0, secI = 0;
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < sec; k++) {
                if (secR == 7) {
                    humen = humen + 1;
                    secR = 0;
                }
                if (secS == 12) {
                    humen = humen - 1;
                    secS = 0;
                }
                if (secI == 45) {
                    humen = humen + 1;
                    secI = 0;
                }

                secR++;
                secS++;
                secI++;
            }

            System.out.println("количество людей: "+(int)humen);
        }

    }
}
