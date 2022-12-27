package com.java.study.task1_double_values_array_list;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Print five words:");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(input.next());
        }
        list = doubleValues(list);
        for (String temp: list) {
            System.out.println(temp);
        }
    }
    public static ArrayList<String> doubleValues(ArrayList<String> list){
        list.addAll(list);
        Collections.sort(list);
        return list;
    }
}
