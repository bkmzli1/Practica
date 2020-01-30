package ru.bkmz.practica.metodicka.pr1;

import java.util.Scanner;

/**
 * стр 20
 */
public class Main {
    static double a, b, c, D, x1, x2;

    public static void main(String[] arg) {
        Scanner scn = new Scanner(System.in);
        System.out.print("A=");
        a = scn.nextDouble();
        System.out.println();
        System.out.print("B=");
        b = scn.nextDouble();
        System.out.println();
        System.out.print("C=");
        c = scn.nextDouble();
        System.out.println();

        D = b * b - 4d * a * c;
        System.out.println("D= " + D);


        x1 = (-b - Math.sqrt(D)) / (2 * a);
        x2 = (-b + Math.sqrt(D)) / (2 * a);

        System.out.println("x1=" + x1);
        System.out.println("x2=" + x2);

    }


}
