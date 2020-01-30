package ru.bkmz.practica.zadanie.B;

/**
 * Created by user on 15.01.2020.
 */
public class MainWhile {
    public static void main(String[] arg) {
        double sumA = 100_000d,//первый вклад
                sumB = 200_000d;//второ вклад
        while (sumA < sumB) {//пока 1 вклад не привысит 2 вклад
            sumA = sumA * Math.pow((1d + 10d), 2);//увеличение 1 вклада
            sumB = sumB * Math.pow((1d + 2d), 2);//увелечение 2 вклада
        }
        //вывод резултатов
        System.out.println("1 вклад: "+sumA);
        System.out.println("2 вклад: "+sumB);
    }
}
