package com.leaf.designPatterns.structural.compositePattern;

import java.util.*;

/**
 * @author leshu
 * @since 2025/3/13 10:47
 **/
public class Main {

    public static Queue<Department> bfsQueue = new LinkedList<>();

    public static Department init() {
        Department top = new Department("100000", "顶级部门");

        Department level1_1 = new Department("101000", "一级部门1");
        Department level1_2 = new Department("102000", "一级部门2");
        Department level1_3 = new Department("103000", "一级部门3");

        Department level2_1 = new Department("101010", "二级部门1");
        Department level2_2 = new Department("102020", "二级部门2");
        Department level2_3 = new Department("103030", "二级部门3");
        Department level2_4 = new Department("101010", "二级部门4");
        Department level2_5 = new Department("102020", "二级部门5");
        Department level2_6 = new Department("103030", "二级部门6");

        top.addSubDepartment(level1_1);
        top.addSubDepartment(level1_2);
        top.addSubDepartment(level1_3);
        level1_1.addSubDepartment(level2_1);
        level1_1.addSubDepartment(level2_2);
        level1_2.addSubDepartment(level2_3);
        level1_2.addSubDepartment(level2_4);
        level1_3.addSubDepartment(level2_5);
        level1_3.addSubDepartment(level2_6);
        return top;
    }

    public static void dfsPrint(Department node) {
        if (node != null) {
            System.out.println(node);
            if (node.getSubDepartment() != null && node.getSubDepartment().size() > 0) {
                for (Department d : node.getSubDepartment()) {
                    dfsPrint(d);
                }
            }
        }
    }

    public static void bfsPrint(Department node) {
        bfsQueue.add(node);
        while (!bfsQueue.isEmpty()) {
            node = bfsQueue.poll();
            System.out.println(node);
            if (node.getSubDepartment() != null && node.getSubDepartment().size() > 0) {
                bfsQueue.addAll(node.getSubDepartment());
            }
        }
    }

    public static void main(String[] args) {
        Department root = init();

        dfsPrint(root);
        System.out.println();
        bfsPrint(root);
    }
}
