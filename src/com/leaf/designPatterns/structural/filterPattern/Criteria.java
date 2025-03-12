package com.leaf.designPatterns.structural.filterPattern;

import java.util.List;

/**
 * @author leshu
 * @since 2025/3/12 17:14
 **/
public interface Criteria {

    List<Person> meetCriteria(List<Person> personList);
}
