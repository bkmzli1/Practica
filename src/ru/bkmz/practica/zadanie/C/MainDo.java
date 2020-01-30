package ru.bkmz.practica.zadanie.C;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainDo {
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(System.in);//получить систему ввода из консоли
            System.out.print("Веедите чистло: ");//вывод на экран сообщения
            int n = scn.nextInt();//получить целочисленое чило из консоли
            int i = 0, j = n;//переменные счёчика
            //поэтапный вывод цифр для оброзования узора при котором идёт вычетание последней выведеной цифры
            do {
                j = n;
                do {
                    System.out.print(j + " ");
                    j--;
                } while (j > i);
                System.out.println();
                i++;
            } while (i < n);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("\u001B[31m" + "error: ты не то вёл".toUpperCase() + " \u001B[0m");
            main(args);
        }

    }
}
