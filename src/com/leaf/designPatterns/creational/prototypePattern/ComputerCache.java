package com.leaf.designPatterns.creational.prototypePattern;

import java.util.Hashtable;

/**
 * @author leshu
 * @since 2025/3/11 14:24
 **/
public class ComputerCache {

    private static Hashtable<String, Computer> computerMap = new Hashtable<>();

    public static Computer getComputer(String id) {
        Computer cachedComputer = computerMap.get(id);
        return cachedComputer.clone();
    }

    public static void createCache() {
        MacBook macBook = new MacBook();
        macBook.setId("1");
        macBook.setOs("macOS");
        computerMap.put(macBook.getId(), macBook);

        MateBook mateBook = new MateBook();
        mateBook.setId("2");
        mateBook.setOs("windows");
        computerMap.put(mateBook.getId(), mateBook);
    }
}
