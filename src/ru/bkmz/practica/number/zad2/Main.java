package ru.bkmz.practica.number.zad2;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double M = getM();
        double initialTemperature = getInitialT();
        double finalT = getFinalT() ;

        double Q = getQ(M, finalT, initialTemperature);
        System.out.print("Потребуется энергии: " + Q);
    }
    // 55,5 3,5 10,5

    static double getM() {
        System.out.print("Введите количество воды в килограммах: ");
        return scanner.nextDouble();
    }

    static double getInitialT() {
        System.out.print("Введите начальную температуру: ");
        return scanner.nextDouble();
    }

    static double getFinalT() {
        System.out.print("Введите конечную температуру: ");
        return scanner.nextDouble();
    }

    static double getQ(double M, double finalTemperature, double initialTemperature) {
        return M * (initialTemperature - finalTemperature) * 4184;
    }
}
