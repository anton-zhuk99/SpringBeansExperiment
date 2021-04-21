package com.example.demo;

import org.springframework.beans.factory.annotation.Value;

public class Department {

    @Value("${department.name}")
    private String name;
    @Value("${department.staff}")
    private int staff; // kol-vo ludei

    public Department() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStaff() {
        return staff;
    }

    public void setStaff(int staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", staff=" + staff +
                '}';
    }
}
