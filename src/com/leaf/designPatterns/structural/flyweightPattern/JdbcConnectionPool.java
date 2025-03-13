package com.leaf.designPatterns.structural.flyweightPattern;

import com.leaf.designPatterns.structural.flyweightPattern.impl.JdbcConnection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leshu
 * @since 2025/3/13 15:29
 **/
public class JdbcConnectionPool {

    private final List<Connection> connectionPoolMap = new ArrayList<>();

    private final int minPoolSize;

    public JdbcConnectionPool(int minPoolSize) {
        this.minPoolSize = minPoolSize;
    }

    public Connection getConnection() {
        if (connectionPoolMap.size() < minPoolSize) {
            System.out.println("new jdbcConnection created.");
            JdbcConnection jdbcConnection = new JdbcConnection();
            connectionPoolMap.add(jdbcConnection);
        }
        return connectionPoolMap.get(0);
    }
}
