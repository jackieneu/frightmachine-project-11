package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.Accessory;

import java.util.function.Consumer;


public class AccessoryAdapter implements Accessory {
    private Consumer<Integer> observer;
    private int number;

    public AccessoryAdapter(Consumer<Integer> observer, int number){
        this.observer = observer;
        this.number = number;
    }

    @Override
    public void activate() {
        observer.accept(number);
    }
}
