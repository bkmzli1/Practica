package ru.bkmz.practica.number3.number3;

import java.math.BigDecimal;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double numPolSum,numProc;
        BigDecimal prc,obSum;

        Scanner scn = new Scanner(System.in);

        System.out.print("введите пром. сум.");
        numPolSum = scn.nextDouble();
        System.out.print("введите прц. возр.");
        numProc = scn.nextDouble();

        prc = new BigDecimal(numPolSum);
        prc = prc.multiply(BigDecimal.valueOf(numProc));
        prc = prc.divide(BigDecimal.valueOf(100));

        System.out.println(prc.toString());
        System.out.println(prc.add(BigDecimal.valueOf(numPolSum)));



    }
}
