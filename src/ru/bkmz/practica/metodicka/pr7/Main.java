package ru.bkmz.practica.metodicka.pr7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
            int year = 2014;
            int population = 650000;
            do {
                System.out.println("В " + year
                        + " году в городе живет "
                        + population);
                population = (population * 103) / 100;
                year++;
            } while (year <= 2040);
            //2
        int number; // здесь будет оригинальное число
        System.out.print("Введите number (>0): ");
        try {
            BufferedReader br = new BufferedReader(new
                    InputStreamReader(System.in));
            String s = br.readLine();
            System.out.println(s);
            number = Integer.parseInt(s);
        } catch (IOException e) {
            System.out.println("IOException: "
                    + e.getMessage());
            e.printStackTrace();
            return;
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: "
                    + e.getMessage());
            e.printStackTrace();
            return;
        }
// Вычисляем сумму цифр
        int s = 0;
        while (number > 0) {
// остаток от деления на 10 это последняя
// цифра числа. Например: 129 % 10 = 9
            int digit = number % 10;
// к сумме добавляем только что полученную цифру
            s = s + digit;
// отбрасываем последнюю цифру числа
// Например: 129 / 10 = 12
            number = number / 10;
        }
        System.out.println("Сумма цифр: " + s);
    }
}
