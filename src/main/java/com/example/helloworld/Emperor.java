package com.example.helloworld;

public class Emperor extends Person {

    private String gens;

    Emperor(String gens, String name, int age) {
        super(name, RolePerson.emperor, age);
        this.gens = gens;
    }

    @Override
    public int getGlobalId() {
        return super.getGlobalId();
    }

    public String getGens() {
        return gens;
    }
}
