package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    public Conditioner conditioner = new Conditioner();
    @Test
    public void shouldIncreaseCurrentTemperature() {
        conditioner.setCurrentTemperature(20);
        conditioner.setMaxTemperature(35);
        conditioner.increaseCurrentTemperature();
        assertEquals(35, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldDecreaseCurrentTemperature() {
        conditioner.setCurrentTemperature(20);
        conditioner.setMinTemperature(15);
        conditioner.decreaseCurrentTemperature();
        assertEquals(15, conditioner.getCurrentTemperature());
    }
}