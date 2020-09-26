package ru.netology;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    @ParameterizedTest
    @CsvFileSource(resources = "/IncreaseCurrentTemperature.csv")
    public void shouldIncreaseCurrentTemperature(String test, int maxTemperature, int currentTemperature, int minTemperature, int expected) {
        conditioner.setMaxTemperature(maxTemperature);
        conditioner.setMinTemperature(minTemperature);
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println("Текущая температура = " + conditioner.getCurrentTemperature());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DecreaseCurrentTemperature.csv")
    public void shouldDecreaseCurrentTemperature(String test, int maxTemperature, int currentTemperature, int minTemperature, int expected) {
        conditioner.setMinTemperature(minTemperature);
        conditioner.setMaxTemperature(maxTemperature);
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println("Текущая температура = " + conditioner.getCurrentTemperature());
    }
}