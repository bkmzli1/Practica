package ru.bkmz.practica.metodicka.pr2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) {
        int val1 = 9, val2 = 10, val3 = 6, min_val = Integer.MAX_VALUE;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(val1);
        arrayList.add(val2);
        arrayList.add(val3);
        for (int i :
                arrayList) {
            if (i < min_val) {
                min_val = i;
            }
        }

        System.out.println("min_val = " + min_val);
    }
}
