package com.example.motion;


import java.util.Observable;

public abstract class MotionDetector extends Observable {
    public abstract void onMotionDetected();

    public void simulateMotion() {
        onMotionDetected();
    }
}
