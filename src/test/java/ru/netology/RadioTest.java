package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio wave = new Radio();

    @Test
    public void nextWave() {
        wave.setCurrentWave(9);
        wave.nextWave();
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
    public void decreaseVolumeBelowMin() {
        wave.setCurrentVolume(-101);
        wave.decreaseVolume();
        assertEquals(0, wave.getMinVolume());
    }

    @Test
    public void setCurrentWave() {
        wave.setCurrentWave(8);
        assertEquals(8, wave.getCurrentWave());
    }

    @Test
    public void previousWave() {
        wave.setCurrentWave(-1);
        wave.previousWave();
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

    @Test
    public void setDesiredVolume() {
        wave.setCurrentVolume(9);
        assertEquals(9, wave.getCurrentVolume());
    }

    @Test
    public void nextWaveAboveMax() {
        wave.setCurrentWave(11);
        wave.nextWave();
        assertEquals(9, wave.getMaxWave());
    }

    @Test
    public void decreaseWaveBelowMin() {
        wave.setCurrentWave(0);
        wave.decreaseWave();
        assertEquals(0, wave.getMinWave());
    }

    @Test
    public void plusVolume() {
        wave.setCurrentVolume(3);
        wave.plusVolume();
        assertEquals(4, wave.getCurrentVolume());
    }

    @Test
    public void plusVolumeAboveMax() {
        wave.setCurrentVolume(65);
        wave.plusVolume();
        assertEquals(10, wave.getMaxVolume());
    }
}