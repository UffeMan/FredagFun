








































package com.zymcox;

import java.util.List;

class Main {

    public static void main(String[] args) {

        System1 system1 = new System1();
        System2 system2 = new System2();

        SingletonLog instance = SingletonLog.getInstance();
        instance.addToLog("Main på gång");

        system1.sys1Jobb();
        system2.sys2Jobb();

        List<String> log = instance.getLog();
        System.out.println(log);
    }


}

class System1 {
    public System1() {
        SingletonLog log = SingletonLog.getInstance();
        log.addToLog("System ett skapad");
    }

    public void sys1Jobb() {
        SingletonLog log = SingletonLog.getInstance();
        log.addToLog("System ett jobbar");
        log.addToLog("och jobbar");
    }
}


class System2 {
    public System2() {
        SingletonLog log = SingletonLog.getInstance();
        log.addToLog("System två skapad");
    }

    public void sys2Jobb() {
        SingletonLog log = SingletonLog.getInstance();
        log.addToLog("System två slöar mest");
        log.addToLog("och... zzzzzzzzz");
    }
}