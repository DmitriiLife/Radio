package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio wave = new Radio();

    @Test
    public void nextWave() {
        wave.setCurrentWave(10);
        wave.nextWave();
        assertEquals(0, wave.getCurrentWave());
    }

    @Test
    public void decreaseWave() {
        wave.setCurrentWave(0);
        wave.decreaseWave();
        assertEquals(10, wave.getCurrentWave());
    }

    @Test
    public void waveAboveMax() {
        wave.setCurrentWave(110);
        wave.nextWave();
        assertEquals(10, wave.getMaxWave());
    }

    @Test
    public void waveBelowMin() {
        wave.setCurrentWave(-1);
        wave.nextWave();
        assertEquals(0, wave.getMinWave());
    }

    @Test
    public void plusVolumeAboveMax() {
        wave.setCurrentVolumeMax(110);
        wave.plusVolume();
        assertEquals(100, wave.getMaxVolume());
    }

    @Test
    public void decreaseVolumeBelowMin() {
        wave.setCurrentVolumeMin(-1);
        wave.decreaseVolume();
        assertEquals(0, wave.getMinVolume());
    }

    @Test
    public void plusVolumeMax() {
        wave.setCurrentVolumeMax(101);
        wave.plusVolume();
        assertEquals(100, wave.getMaxVolume());
    }

    @Test
    public void minusVolumeMin() {
        wave.setCurrentVolumeMin(0);
        wave.decreaseVolume();
        assertEquals(0, wave.getMinVolume());
    }

    @Test
    public void plusVolume() {
        wave.setCurrentVolumeMax(98);
        wave.plusVolume();
        assertEquals(99, wave.getCurrentVolume());
    }

    @Test
    public void decreaseVolume() {
        wave.setCurrentVolumeMin(98);
        wave.decreaseVolume();
        assertEquals(97, wave.getCurrentVolume());
    }

    @Test
    public void minusWave() {
        wave.setCurrentWave(5);
        wave.decreaseWave();
        assertEquals(4, wave.getCurrentWave());
    }

    @Test
    public void setWave() {
        wave.setCurrentWave(0);
        assertEquals(0, wave.getCurrentWave());
    }
}