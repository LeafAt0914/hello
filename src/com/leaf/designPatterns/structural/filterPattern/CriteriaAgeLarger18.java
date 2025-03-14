package com.leaf.designPatterns.structural.filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leshu
 * @since 2025/3/12 17:20
 **/
public class CriteriaAgeLarger18 implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> ageLarger18PersonList = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() > 18) {
                ageLarger18PersonList.add(person);
            }
        }
        return ageLarger18PersonList;
    }
}
