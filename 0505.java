package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран c новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Зефир", 7, 7,100);
        Cat cat2 = new Cat("Мурз", 5, 6,10);
        Cat cat3 = new Cat("Маша", 8, 2,12);

        if(cat1.fight(cat2)) System.out.println(cat1.name);
        else System.out.println(cat2.name);
        if (cat1.fight(cat3)) System.out.println(cat1.name);
        else System.out.println(cat3.name);
        if (cat2.fight(cat3)) System.out.println(cat2.name);
        else System.out.println(cat3.name);//напишите тут ваш код
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
