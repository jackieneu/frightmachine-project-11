package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.Accessory;
import com.example.motion.MotionDetector;

import java.util.ArrayList;
import java.util.List;


public class FrightMachine extends MotionDetector {
    private List<Accessory> accessories;

    public FrightMachine(){
        accessories = new ArrayList<>();
    }

    public void addAccessory(Accessory accessory){
        accessories.add(accessory);
    }

    public void removeAccessory(Accessory accessory){
        accessories.remove(accessory);
    }

    @Override
    public void onMotionDetected() {
        for(Accessory accessory : accessories){
            accessory.activate();
        }
    }
}
