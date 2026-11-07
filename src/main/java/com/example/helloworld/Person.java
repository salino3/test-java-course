package com.example.helloworld;

enum RolePerson {
    citizen, slave, legionary, emperor, oracle
};

public class Person {

    static private int counterId = 1;
    private int id;
    private String name;
    private RolePerson role;
    private int age;

    public Person(String name, RolePerson role, int age) {
        this.name = name;
        this.role = role;
        this.age = age;
        id = counterId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public RolePerson getRole() {
        return role;
    }

    public int getAge() {
        return age;
    }
}
