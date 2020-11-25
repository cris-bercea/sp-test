package com.company;

public class Main {
    public static void main(String[] args)
    {
        Panel cap1 = new Panel("Panel 1");
        Panel cap2 = new Panel("Panel 2");
        Panel cap3 = new Panel("Panel 3");
        Camera c1 = new Camera("Camera","people");
        Proximity p1 = new Proximity("Proximity");
        Lidar l1 = new Lidar("Lidar");
        Temperature t1 = new Temperature("Temperature");
        cap1.add(c1);
        cap2.add(cap1);
        cap2.add(cap3);
        cap3.add(p1);
        cap2.add(l1);
        cap2.add(t1);
        cap2.print();
    }
}
