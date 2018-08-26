package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

Пример: m=2, n=4
8888
8888
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader iSR = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(iSR);


        String mStr = bufferedReader.readLine();
        String nStr = bufferedReader.readLine();

        int m = Integer.parseInt(mStr);
        int n = Integer.parseInt(nStr);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

    }
}
