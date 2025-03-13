package com.leaf.designPatterns.structural.flyweightPattern;

/**
 * @author leshu
 * @since 2025/3/13 15:42
 **/
public class Main {

    public static void main(String[] args) {
        JdbcConnectionPool jdbcConnectionPool = new JdbcConnectionPool(5);

        for (int i = 0; i < 10; i++) {
            Connection connection = jdbcConnectionPool.getConnection();
            connection.send();
        }
    }
}
