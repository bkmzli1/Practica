package ru.bkmz.practica.metodicka.pr8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        int n;
        System.out.print("Введите n: ");
            BufferedReader br = new BufferedReader(new
                    InputStreamReader(System.in));
//Читаем из консоли
            String s = br.readLine();
//конвертируем строку в число
            n = Integer.parseInt(s);

// Формируем узор
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
