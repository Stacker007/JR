package com.javarush.task.task04.task0439;

/* 
Письмо счастья
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: "*имя* любит меня."

Пример вывода на экран для имени Света:
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader iSR = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(iSR);


        String name = bufferedReader.readLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(name + " любит меня.");
        }

    }
}
