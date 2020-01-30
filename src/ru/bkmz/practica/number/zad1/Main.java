package ru.bkmz.practica.number.zad1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 21.01.2020.
 */
public class Main extends  Exception {
    static final int DAYS = 365;
//1000000000
    public static void main(String[] args) {
        int user = getUserMin();
        int days = toDays(user);
        ArrayList<Integer> yearsDays = DaysToYears(days);
        int years = yearsDays.get(0);
        days = yearsDays.get(1);
        System.out.println(user + " минут это приблизительно " + years + " лет и " + days + " дней");
    }

    static int getUserMin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество минут: ");
        return scanner.nextInt();
    }

    static int toDays(int min) {
        return min / 1440;
    }

    static ArrayList<Integer> DaysToYears(int days) {
        int year = 0;
        ArrayList<Integer> years_and_days = new ArrayList<>();

        while (days >= 365) {
            year++;
            days -= DAYS;
        }

        years_and_days.add(year);
        years_and_days.add(days);
        return years_and_days;
    }
}
