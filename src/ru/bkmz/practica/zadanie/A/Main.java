package ru.bkmz.practica.zadanie.A;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double kit,//ящики
                box,//коробки
                pack;//заказ

        try {
            Scanner scn = new Scanner(System.in);//получить систему ввода из консоли
            System.out.print("Введите кол. печенек: ");//вывод на экран сообщения
            pack = scn.nextInt();//получить целочисленое чило из консоли

            //рассчитать количество коробок
            if (pack >= 12) {
                box = Math.ceil(pack / 12);
            } else if (pack > 0 && pack < 12) {
                box = Math.ceil(pack / 12) + 1;
            } else {
                box = 0;
            }
            //рассчитать количество ящиков
            if (box >= 18) {
                kit = Math.ceil(box / 18);
            } else if (box > 0 && box < 18) {
                kit = Math.ceil(box / 18) + 1;
            } else {
                kit = 0;
            }
            //вывод на экран резултатов расчёта
            System.out.println("пачек: " + (int) pack);
            System.out.println("коробок: " + (int) box);
            System.out.println("ящиков: " + (int) kit);
            //исключение при вводе неправельного значения
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("\u001B[31m" + "error: ты не то вёл".toUpperCase() + " \u001B[0m");
            main(args);
        }



    }
}
