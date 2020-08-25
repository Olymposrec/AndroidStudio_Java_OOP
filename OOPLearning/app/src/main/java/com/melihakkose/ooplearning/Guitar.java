package com.melihakkose.ooplearning;

public class Guitar implements Instrument,Market {
    String model;
    boolean available;

    @Override
    public void info() {
        System.out.println("Override Method");

    }
}
