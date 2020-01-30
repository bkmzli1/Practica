package ru.bkmz.practica.zadanie.C;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainWhile {
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(System.in);//получить систему ввода из консоли
            System.out.print("Веедите чистло: ");//вывод на экран сообщения
            int n = scn.nextInt();//получить целочисленое чило из консоли
            //поэтапный вывод цифр для оброзования узора при котором идёт вычетание последней выведеной цифры
            int i = 0, j = n;
            while (i < 5) {
                j = n;
                while (j > i) {
                    System.out.print(j + " ");
                    j--;
                }
                System.out.println();
                i++;
            }
            //исключение при вводе неправельного значения
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("\u001B[31m" + "error: ты не то вёл".toUpperCase() + " \u001B[0m");
            main(args);
        }

    }
}
