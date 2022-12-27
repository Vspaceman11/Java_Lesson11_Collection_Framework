package com.java.study.task3_map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Kiev", "Ivanov");
        map.put("Paris", "Macron");
        map.put("London", "Johnson");
        map.put("Detroit", "Smith");
        map.put("Odesa", "Borisov");
        System.out.println(map.get("Odesa"));
    }
}
