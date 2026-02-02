package com.rikkeiedu.management;

public class Student {
    public static final String SCHOOL_NAME = "Rikkei Academy";

    // Biến static auto-increment ID
    private static int autoId = 1;

    private final int id;
    private String fullName;
    private double score;
    private String className;

    public Student(String fullName, double score, String className) {
        this.id = autoId++;
        this.fullName = fullName;
        this.score = score;
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public double getScore() {
        return score;
    }

    public void display() {
        System.out.println("ID: " + id + " | Name: " + fullName + " | Score: " + score + " | Class: " + className + " | School: " + SCHOOL_NAME);
    }
}
