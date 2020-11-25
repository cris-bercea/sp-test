package com.company;

public class Lidar implements Sensor{
    private String name;

    public Lidar(String name) {
        this.name = name;
    }

    public void print(){

        System.out.println("Lidar-> name: " + this.name);
    }
}
