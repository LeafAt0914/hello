package com.leaf.designPatterns.structural.flyweightPattern;

/**
 * @author leshu
 * @since 2025/3/13 15:28
 **/
public class JdbcConnection implements Connection {

    @Override
    public void send() {
        System.out.println("select * from table_A");
    }
}
