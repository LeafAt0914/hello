package com.leaf.designPatterns.structural.filterPattern;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void print(List<Person> personList) {
        for (Person person : personList) {
            System.out.println(person.toString());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Bob", "male", 18));
        personList.add(new Person("Jhon", "male", 19));
        personList.add(new Person("Jane", "female", 17));
        personList.add(new Person("Diana", "female", 19));
        System.out.println("all persons:");
        print(personList);

        Criteria maleCriteria = new CriteriaMale();
        System.out.println("males:");
        print(maleCriteria.meetCriteria(personList));

        Criteria ageLarder18Criteria = new CriteriaAgeLarger18();
        System.out.println("age larger 18 persons:");
        print(ageLarder18Criteria.meetCriteria(personList));
    }
}
