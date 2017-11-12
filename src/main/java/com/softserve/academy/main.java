package com.softserve.academy;

public class Employee {
    private String name;
    private int rating;
    private double hours;
    private static int number = 0;
    private static int sum = 0;

    public Employee() {
        number++;
    }

    public Employee(String name) {
        this.name = name;
        number++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
        sum += rating;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public static double getTotalHours() {
        return (double) sum / number;
    }

    public void changeRating(int raiting) {
        sum -= this.rating;
        this.rating = rating;
        sum += rating;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rating=" + rating + "]";
    }
}

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new employee("Oleg");
        employee1.setRating(4);
        Employee employee2 = new Employee("Anna");
        employee2.setRating(5);
        Employee employee3 = new Employee();
        employee3.setName("Mary");
        employee3.setRating(4);