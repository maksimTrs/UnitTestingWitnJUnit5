package com.company;

public class Dog {

    private static String staticField = "Статическая переменная";
    private String name;
    private int age;

    public static String getStaticField() {
        return staticField;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (this.name.isEmpty())
            this.name = name;
      //  else  throw new IllegalArgumentException("Dog already has a name!");
    }

    public void setAge(int age) {
        this.age = age;
    }
}
