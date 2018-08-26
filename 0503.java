package com.javarush.task.task05.task0504;


/* 
Трикотаж
Пару задач назад студенты секретного центра JavaRush создавали
класс Cat. Теперь пришла пора реализовать котов во плоти, разумеется
по образу и подобию класса Cat, а точнее - основываясь на нём, как на
шаблоне. Их - котов - должно быть трое. Наполните этих троих жизнью, то есть, конкретными данными.
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Зефир", 7, 7,100);
        Cat cat2 = new Cat("Мурз", 5, 6,10);
        Cat cat3 = new Cat("Маша", 8, 2,12);
       // Cat cat4 = new Cat("Злюка", 12, 15,11);


        //напишите тут ваш код
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
