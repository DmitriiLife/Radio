package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio wave = new Radio();

    @Test
    public void nextRadioWave() {
        wave.setCurrentWave(9);
        wave.nextRadioWave();
        assertEquals(0, wave.getCurrentWave());
    }

    @Test
    public void decreaseWave() {
        wave.setCurrentWave(5);
        wave.decreaseWave();
        assertEquals(4, wave.getCurrentWave());
    }

    @Test
    public void decreaseVolume() {
        wave.setCurrentVolume(3);
        wave.decreaseVolume();
        assertEquals(2, wave.getCurrentVolume());
    }

    @Test
    public void setCurrentWave() {
        wave.setCurrentWave(8);
        assertEquals(8, wave.getCurrentWave());
    }

    @Test
    public void previousRadioWave() {
        wave.setCurrentWave(0);
        wave.previousRadioWave();
        assertEquals(9, wave.getCurrentWave());
    }

    @Test
    public void setAnyMinusWave() {
        wave.setCurrentWave(-9);
        assertEquals(0, wave.getCurrentWave());
    }

    @Test
    public void setAnyMinusVolume() {
        wave.setCurrentVolume(-9);
        assertEquals(0, wave.getCurrentVolume());
    }
}