package com.leaf.designPatterns.structural.filterPattern;

/**
 * @author leshu
 * @since 2025/3/12 17:10
 **/
public class Person {

    private String name;

    private String gender;

    private int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "name = " + name +
                ", gender = " + gender +
                ", age = " + age;
    }
}
