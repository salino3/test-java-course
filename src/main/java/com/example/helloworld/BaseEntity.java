package com.example.helloworld;

public abstract class BaseEntity {

    private static int globalCounterId = 1;
    private int globalId;

    public BaseEntity() {
        this.globalId = globalCounterId++;
    }

    public int getGlobalId() {
        return globalId;
    }
}