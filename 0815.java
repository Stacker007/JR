package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> stringStringHashMap = new HashMap<>();

        stringStringHashMap.put("Имя", "Фамилия");//1
        stringStringHashMap.put("Саша", "Петрушенко");//2
        stringStringHashMap.put("Елена", "Петрушекно");//3
        stringStringHashMap.put("Владимир", "Степанович");//4
        stringStringHashMap.put("Александр", "Кореба");//5
        stringStringHashMap.put("Инженер", "Мельникова");//6
        stringStringHashMap.put("Милена", "Лешкова");//7
        stringStringHashMap.put("Виктория", "Горбачева");//8
        stringStringHashMap.put("Анна", "Каренина");//9
        stringStringHashMap.put("Виктор", "Серов");//10

        //напишите тут ваш код
        return stringStringHashMap;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        Iterator<Map.Entry<String,String>> hashMapIterator = map.entrySet().iterator();
        int count = 0;
        while (hashMapIterator.hasNext()){
            Map.Entry<String ,String > entry = hashMapIterator.next();
            if (entry.getKey().equals(name)) count++;
        }

        //напишите тут ваш код
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();//напишите тут ваш код
        int count = 0;
        while (entryIterator.hasNext()){
            Map.Entry<String ,String > entry = entryIterator.next();
            if (entry.getValue().equals(lastName)) count++;
        }
        return count;

    }

    public static void main(String[] args) {
        HashMap my = createMap();
        System.out.println(getCountTheSameFirstName(my, "Саша"));
        System.out.println(getCountTheSameLastName(my, "Петрушенко"));

    }
}
