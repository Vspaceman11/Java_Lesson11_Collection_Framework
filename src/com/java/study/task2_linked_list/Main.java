package com.java.study.task2_linked_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = getIntegerList();
        System.out.println(getMinimum(list));
    }
    public static int getMinimum(LinkedList<Integer> list){
        return Collections.min(list);
    }
    public static LinkedList<Integer> getIntegerList(){
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        return list;
    }
}
