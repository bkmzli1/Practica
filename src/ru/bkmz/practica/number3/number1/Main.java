package ru.bkmz.practica.number3.number1;

import java.util.Scanner;


public class Main {
    static double  PI = Math.PI;
    public static void main(String[] args) {
        double R, S, V, s;
        Scanner scn = new Scanner(System.in);
        System.out.print("введите радиус:");
        R = scn.nextDouble();

        System.out.print("введите площадь:");
        s = scn.nextDouble();
        System.out.println();
        S = R * R * PI;
        V = S * s;
        System.out.println("целиндер с радиусом"+R+"и длиной "+s+"имеет площадь равную "+S+"и обём равный "+V);
    }
}
