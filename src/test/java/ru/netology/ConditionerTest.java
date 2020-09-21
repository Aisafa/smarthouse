package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    @ParameterizedTest
    @CsvFileSource(resources = "/IncreaseCurrentTemperature.csv")
    public void shouldIncreaseCurrentTemperature(String test, int CurrentTemperature, int MaxTemperature, int expected) {
        conditioner.setCurrentTemperature(CurrentTemperature);
        conditioner.setMaxTemperature(MaxTemperature);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println("Текущая температура = " + conditioner.getCurrentTemperature());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DecreaseCurrentTemperature.csv")
    public void shouldDecreaseCurrentTemperature(String test, int CurrentTemperature, int MinTemperature, int expected) {
        conditioner.setCurrentTemperature(CurrentTemperature);
        conditioner.setMinTemperature(MinTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println("Текущая температура = " + conditioner.getCurrentTemperature());
    }
}