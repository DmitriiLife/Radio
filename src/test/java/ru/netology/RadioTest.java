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
        wave.setCurrentWave(0);
        wave.decreaseWave();
        assertEquals(9, wave.getCurrentWave());
    }

    @Test
    public void waveAboveMax() {
        wave.setCurrentWave(11);
        wave.nextWave();
        assertEquals(9, wave.getMaxWave());
    }

    @Test
    public void waveBelowMin() {
        wave.setCurrentWave(-1);
        wave.nextWave();
        assertEquals(0, wave.getMinWave());
    }

    @Test
    public void plusVolumeAboveMax() {
        wave.setCurrentVolume(11);
        wave.plusVolume();
        assertEquals(10, wave.getMaxVolume());
    }

    @Test
    public void decreaseVolumeBelowMin() {
        wave.setCurrentVolume(-1);
        wave.decreaseVolume();
        assertEquals(0, wave.getMinVolume());
    }

    @Test
    public void plusVolumeMax() {
        wave.setCurrentVolume(10);
        wave.plusVolume();
        assertEquals(10, wave.getMaxVolume());
    }

    @Test
    public void minusVolumeMin() {
        wave.setCurrentVolume(0);
        wave.decreaseVolume();
        assertEquals(0, wave.getMinVolume());
    }

    @Test
    public void plusVolume() {
        wave.setCurrentVolume(3);
        wave.plusVolume();
        assertEquals(4, wave.getCurrentVolume());
    }

    @Test
    public void decreaseVolume() {
        wave.setCurrentVolume(3);
        wave.decreaseVolume();
        assertEquals(2, wave.getCurrentVolume());
    }

    @Test
    public void minusWave() {
        wave.setCurrentWave(5);
        wave.decreaseWave();
        assertEquals(4, wave.getCurrentWave());
    }
}