package ru.netology;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void increaseCurrentTemperature() {
        for (int i = currentTemperature; true; i++) {
            currentTemperature = i;
            System.out.println(currentTemperature);
            if (i >= maxTemperature) {
                return;
            }
        }
    }

    public void decreaseCurrentTemperature() {
        for (int i = currentTemperature; true; i--) {
            currentTemperature = i;
            System.out.println(currentTemperature);
            if (i <= minTemperature) {
                return;
            }
        }

    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}


