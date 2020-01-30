package ru.bkmz.practica.zadanie.C;


import java.util.InputMismatchException;
import java.util.Scanner;

public class MainFor {
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(System.in);//получить систему ввода из консоли
            System.out.print("Веедите чистло: ");//вывод на экран сообщения
            int n = scn.nextInt();//получить целочисленое чило из консоли
            //поэтапный вывод цифр для оброзования узора при котором идёт вычетание последней выведеной цифры
            for (int i = 0; i < 5; i++) {
                for (int j = n; j > i; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            //исключение при вводе неправельного значения
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("\u001B[31m" + "error: ты не то вёл".toUpperCase() + " \u001B[0m");
            main(args);
        }
    }
}
