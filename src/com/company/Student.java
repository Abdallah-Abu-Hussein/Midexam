package com.company;

abstract class Student {
    String name;
    Address address;

    public Student(String name) {
        this.name = name;
    }

    abstract double calculateAverage();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MarkBased{" +
                "name=' " + name + '\'' +
                "  The Average = "+calculateAverage()+
                '}';
    }
}
