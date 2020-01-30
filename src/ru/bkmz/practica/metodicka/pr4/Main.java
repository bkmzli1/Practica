package ru.bkmz.practica.metodicka.pr4;

public class Main {
    public static void main(String[] args) {
        int v_max = 40; // задано ограничение скорости
        int v = 121; // задана скорость нарушителя
        if ( v <= v_max) {
            System.out.println("Все по правилам!");
        } else if (v <= v_max + 20) {
            System.out.println("не штрафуется");
        } else if (v <= v_max + 40) {
            System.out.println("500");
        } else if (v <= v_max + 60) {
            System.out.println("1000-1500");
        } else if (v <= v_max + 80) {
            System.out.println("2000-2500");
        } else {
            System.out.println("5000");
        }
    }
}
