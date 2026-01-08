package com.example.demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SingletonExample {

    private static SingletonExample instance = null;

    private String dbUrl;
    private String dbUser;
    private String dbPass;
    private static Lock lock = new ReentrantLock();

    private SingletonExample() {
        try {
            dbUrl = "jdbc:mysql://localhost:3306/test";
            dbUser = "root";
            dbPass = "root";
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SingletonExample getInstance() {
        if (instance == null) {
            lock.lock();
            if (instance == null) {
                instance = new SingletonExample();
            }
            lock.unlock();
        }
        return instance;
    }
}
