package ru.bkmz.practica.metodicka.pr5;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception{
        int t;

// !!! Здесь может быть выброшено исключение
// ввода-вывода

            BufferedReader br = new BufferedReader(new
                    InputStreamReader(System.in));
//Читаем из консоли строку
// !!! Здесь может быть выброшено исключение
// ввода-вывода
            String s = br.readLine();
//конвертируем строку в число t
// !!! Здесь может быть выброшено исключение
// неправильного формата числа
            t = Integer.parseInt(s);
//Ловим исключения ввода-вывода

// Если исключений не было – дойдем до этого кода
// и выведем введенное значение t
        System.out.println("t=" + t);
    }
}
