package ru.bkmz.practica.metodicka.pr6;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws Exception{

        System.out.println(File.separator);
        int t;
        System.out.print("Введите t: ");
            BufferedReader br = new BufferedReader(new
                    InputStreamReader(System.in));
//Читаем из консоли
            String s = br.readLine();
//конвертируем строку в число
            t = Integer.parseInt(s);
//Ловим исключения ввода-вывода

// собственно вывод «Тепло», «Нормально» и «Холодно»
        if (t > -5) {
            System.out.println("Тепло!");
        } else if (t > -20) {
            System.out.println("Нормально!");
        } else {
            System.out.println("Холодно!");

        }
    }
}

