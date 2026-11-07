package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;

public class City {

    static private int counterId = 1;
    private int id;
    String name;
    int yearFoundation;
    // Person mayor;
    // Person citizens;
    private List<District> districts;
    private List<Library> allLibraries;

    public City(String name, int yearFoundation) {
        this.name = name;
        this.yearFoundation = yearFoundation;
        this.districts = new ArrayList<>();
        this.allLibraries = new ArrayList<>();
        this.id = counterId++;
    }

    public City(String name, int yearFoundation, List<District> districts, List<Library> allLibraries) {
        this.name = name;
        this.yearFoundation = yearFoundation;
        this.districts = districts;
        this.allLibraries = allLibraries;
        this.id = counterId++;
    }

    public int getId() {
        return id;
    }

    public List<Library> getAllLibraries() {
        return allLibraries;
    }

    public String getName() {
        return name;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public int getYearFoundation() {
        return yearFoundation;
    }

    //
    public void addDistrict(District district) {
        this.districts.add(district);
    }

    public void addLibrary(Library library) {
        this.allLibraries.add(library);
    }

    public int calculateTotalBooksInCity() {
        return districts.stream()
                .mapToInt(District::getNumberBooks)
                .sum();
    }

    public void printCityInfo() {
        System.out.println("City: " + name + " (Founded: " + (yearFoundation != 0 ? yearFoundation : "Unknown") + ")");
        System.out.println("Total Districts: " + districts.size());
        System.out.println("Total Independent/City-level Libraries: " + allLibraries.size());
    }

    static public void main(String[] args) {

    }
}
