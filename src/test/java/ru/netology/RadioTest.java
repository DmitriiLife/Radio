package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();
    Radio radioOne = new Radio(20);

    @Test
    public void nextWave() {
        radio.setCurrentWave(9);
        radio.nextWave();
        radioOne.setCurrentWave(8);
        radioOne.nextWave();
        assertEquals(0, radio.getCurrentWave(), radioOne.getCurrentWave());
    }

    @Test
    public void decreaseWave() {
        radio.setCurrentWave(0);
        radio.decreaseWave();
        radioOne.setCurrentWave(0);
        radioOne.decreaseWave();
        assertEquals(9, radio.getCurrentWave(), radioOne.getCurrentWave());
    }

    @Test
    public void waveAboveMax() {
        radio.setCurrentWave(110);
        radio.nextWave();
        radioOne.setCurrentWave(110);
        radioOne.nextWave();
        assertEquals(9, radio.getMaxWave(), radioOne.getMaxWave());
    }

    @Test
    public void waveBelowMin() {
        radio.setCurrentWave(-1);
        radio.nextWave();
        radioOne.setCurrentWave(-1);
        radioOne.nextWave();
        assertEquals(0, radio.getMinWave(), radioOne.getMinWave());
    }

    @Test
    public void plusVolumeAboveMax() {
        radio.setCurrentVolumeMax(110);
        radio.plusVolume();
        radioOne.setCurrentVolumeMax(110);
        radioOne.plusVolume();
        assertEquals(100, radio.getMaxVolume(), radioOne.getMaxVolume());
    }

    @Test
    public void decreaseVolumeBelowMin() {
        radio.setCurrentVolumeMin(-1);
        radio.decreaseVolume();
        radioOne.setCurrentVolumeMin(-1);
        radioOne.decreaseVolume();
        assertEquals(0, radio.getMinVolume(), radioOne.getMinVolume());
    }

    @Test
    public void plusVolumeMax() {
        radio.setCurrentVolumeMax(101);
        radio.plusVolume();
        radioOne.setCurrentVolumeMax(101);
        radioOne.plusVolume();
        assertEquals(100, radio.getMaxVolume(), radioOne.getMaxVolume());
    }

    @Test
    public void minusVolumeMin() {
        radio.setCurrentVolumeMin(0);
        radio.decreaseVolume();
        radioOne.setCurrentVolumeMin(0);
        radioOne.decreaseVolume();
        assertEquals(0, radio.getMinVolume(), radioOne.getMinVolume());
    }

    @Test
    public void plusVolume() {
        radio.setCurrentVolumeMax(98);
        radio.plusVolume();
        radioOne.setCurrentVolumeMax(98);
        radioOne.plusVolume();
        assertEquals(99, radio.getCurrentVolume(), radioOne.getCurrentVolume());
    }

    @Test
    public void decreaseVolume() {
        radio.setCurrentVolumeMin(98);
        radio.decreaseVolume();
        radioOne.setCurrentVolumeMin(98);
        radioOne.decreaseVolume();
        assertEquals(97, radio.getCurrentVolume(), radioOne.getCurrentVolume());
    }

    @Test
    public void minusWave() {
        radio.setCurrentWave(5);
        radio.decreaseWave();
        radioOne.setCurrentWave(5);
        radioOne.decreaseWave();
        assertEquals(4, radio.getCurrentWave(), radioOne.getCurrentWave());
    }

    @Test
    public void setWave() {
        radio.setCurrentWave(0);
        radio.setCurrentWave(0);
        radioOne.setCurrentWave(0);
        radioOne.setCurrentWave(0);
        assertEquals(0, radio.getCurrentWave(), radioOne.getCurrentWave());
    }
}