package com.leaf.designPatterns.structural.filterPattern.impl;

import com.leaf.designPatterns.structural.filterPattern.Criteria;
import com.leaf.designPatterns.structural.filterPattern.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leshu
 * @since 2025/3/12 17:17
 **/
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> malePersonList = new ArrayList<>();
        for (Person person : personList) {
            if (person.getGender().equals("male")) {
                malePersonList.add(person);
            }
        }
        return malePersonList;
    }
}
