package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {


    @Test
    void shouldIncreaseCurrentTemperatureInNormalCondition() {
        Conditioner conditioner = new Conditioner();
        conditioner.increaseCurrentTemperature();
        assertEquals(23, conditioner.getCurrentTemperature());
    }

    @Test

    void shouldIncreaseCurrentTemperatureInHeatCondition() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(35);
        conditioner.increaseCurrentTemperature();
        assertEquals(35, conditioner.getCurrentTemperature());
    }

    @Test
    void shouldDecreaseCurrentTemperatureInUsualConditions() {
        Conditioner conditioner = new Conditioner();
        conditioner.decreaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test

    void shouldDecreaseCurrentTemperatureInColdConditions() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(16);
        conditioner.decreaseCurrentTemperature();
        assertEquals(16, conditioner.getCurrentTemperature());
    }

}

