package com.leaf.designPatterns.structural.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leshu
 * @since 2025/3/13 10:42
 **/
public class Department {

    private String id;

    private String departmentName;

    private List<Department> subDepartment;

    public Department(String id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
        this.subDepartment = new ArrayList<>();
    }

    public void addSubDepartment(Department d) {
        this.subDepartment.add(d);
    }

    public void remove(Department d) {
        this.subDepartment.remove(d);
    }

    public List<Department> getSubDepartment() {
        return this.subDepartment;
    }

    public String toString() {
        return "id = " + id +
                ", departmentName =" + departmentName;
    }
}
