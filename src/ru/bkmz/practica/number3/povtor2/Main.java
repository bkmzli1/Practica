package ru.bkmz.practica.number3.povtor2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double S, P, n;
        Scanner scn = new Scanner(System.in);
        n = scn.nextDouble();
        S = n * n;
        P = 4 * n;
        System.out.println(S);
        System.out.println(P);
    }
}
