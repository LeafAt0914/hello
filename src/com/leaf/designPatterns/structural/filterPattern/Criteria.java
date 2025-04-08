package com.leaf.designPatterns.structural.filterPattern;

import java.util.List;


public interface Criteria {

    List<Person> meetCriteria(List<Person> personList);
}
