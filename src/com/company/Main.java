package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dogNew1 = new Dog("Dog1", 1);
        System.out.println(dogNew1.getName());
        dogNew1.setName("Dog1.1");
        System.out.println(dogNew1.getName());
        System.out.println(Dog.getStaticField());

        System.out.println("-------------------------------");


    }
}
