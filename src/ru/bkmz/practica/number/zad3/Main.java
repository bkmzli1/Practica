package ru.bkmz.practica.number.zad3;

import java.util.Scanner;

/**
 * Created by user on 21.01.2020.
 */
public class Main {
  static   Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        double ri,mpckl,koll;
        System.out.print("Введите будущая стоимость инвестицый:");
        ri = scn.nextDouble();

        System.out.print("Введите месячный прочцент ставки:");
        mpckl = scn.nextDouble();
        System.out.print("Введите количество лет:");
        koll = scn.nextDouble();

        /*ri =1000.56d;
        mpckl =4.25d/100d;
        koll = 1d;*/
        System.out.println("Будущая стоимость инвестиций = "+(ri*(1d+mpckl)*koll));



    }
}
