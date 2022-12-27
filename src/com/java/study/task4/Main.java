package com.java.study.task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Write \"end\" to finish program.");
        while (true){
            String a = input.next();
            if (a.equals("end")){
                break;
            } else {
                list.add(a);
            }
        }

        for (String temp : list) {
            System.out.println(temp);
        }
    }
}
