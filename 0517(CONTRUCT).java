package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)

Задача конструктора - сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;

    public Cat(String name) {
        this.name = name;
        this.weight = 4;
        this.age = 5;
        this.color = "light";
        this.address = null;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "dark";
        this.address = null;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.weight = 4;
        this.age = age;
        this.color = "dark";
        this.address = null;

    }

    public Cat(int weight, String color) {
       // this.name = null;
        this.weight = weight;
        this.age = 2;
        this.color = color;
       // this.address = null;

    }

    public Cat(int weight, String color, String address) {
       // this.name = null;
        this.weight = weight;
        this.age = 2;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
