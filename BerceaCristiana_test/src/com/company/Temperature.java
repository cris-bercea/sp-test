package com.company;

public class Temperature implements Sensor{
    private String name;

    public Temperature(String name) {
        this.name = name;
    }

    public void print(){

        System.out.println("Temperature-> " + this.name);
    }
}
