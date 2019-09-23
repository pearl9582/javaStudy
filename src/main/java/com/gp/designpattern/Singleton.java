package com.gp.designpattern;

public class Singleton {
    private Singleton(){
    }

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getUniqueInstance(){
        return SingletonHolder.INSTANCE;
    }
}
