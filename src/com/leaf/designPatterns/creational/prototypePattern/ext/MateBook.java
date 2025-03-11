package com.leaf.designPatterns.creational.prototypePattern.ext;

import com.leaf.designPatterns.creational.prototypePattern.Computer;

/**
 * @author leshu
 * @since 2025/3/11 14:21
 **/
public class MateBook extends Computer {

    public MateBook() {
        brand = "Huawei";
    }

    @Override
    public void printInfo() {
        System.out.println("mateBook`s brand is " + brand + ", os is " + os);
    }
}
