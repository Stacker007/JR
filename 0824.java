package com.javarush.task.task08.task0824;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
*/
/**
*
*
*
*ЧТОБЫ РАБОТАЛО НУЖНО УБРАТЬ МОДИФИКАТОРЫ ХУМАНА И ГЕТТЕР ДЛЯ ЧИЛДРЕНА
*
*

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human("ch1", true, 15);
        Human child2 = new Human("ch2", true, 10);
        Human child3 = new Human("ch3", false, 3);
        ArrayList<Human> chi= new ArrayList<>();
        chi.add(child1);
        chi.add(child2);
        chi.add(child3);
        Human father = new Human("fath", true, 35,chi);
        Human mother = new Human("moth", false, 35,chi);
        ArrayList<Human> fArr = new ArrayList<>();
        fArr.add(father);
        Human gfF = new Human("gfF", true, 60, fArr);
        Human gmF = new Human("gmF", false, 60, fArr);
        ArrayList<Human>mArr = new ArrayList<>();
        mArr.add(mother);
        Human gfM = new Human("gfM", true, 60, mArr);
        Human gmM = new Human("gmM", false, 60, mArr);
        System.out.println(gfF);
        System.out.println(gmF);
        System.out.println(gfM);
        System.out.println(gmM);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

        //напишите тут ваш код
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<>();


        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;

        }
        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this(name,sex,age);
            this.children = children;

        }

        public void setChildren(ArrayList<Human> children) {
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
