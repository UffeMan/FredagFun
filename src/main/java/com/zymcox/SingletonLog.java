package com.zymcox;

import java.util.LinkedList;
import java.util.List;

public final class SingletonLog {
    private static SingletonLog instance;
    private final List<String> log = new LinkedList<>();

    private SingletonLog() {

    }

    public static SingletonLog getInstance() {
        if (instance == null) {
            instance = new SingletonLog();
        }
        return instance;
    }

    public void addToLog(String newRow) {
        log.add(newRow);
    }

    public List<String> getLog() {
        return log;
    }
}
