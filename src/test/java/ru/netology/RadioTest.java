package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    Radio radioDefault = new Radio();
    Radio radio20Stations = new Radio(19);

    @Test
    public void setWave() {
        radioDefault.setCurrentWave(7);
        assertEquals(7, radioDefault.getCurrentWave());
    }

    @Test
    public void setWaveRadio20() {
        radio20Stations.setCurrentWave(19);
        assertEquals(19, radio20Stations.getCurrentWave());
    }

    @Test
    public void minusWave() {
        radioDefault.setCurrentWave(5);
        radioDefault.decreaseWave();
        assertEquals(4, radioDefault.getCurrentWave());
    }

    @Test
    public void minusWaveRadio20() {
        radio20Stations.setCurrentWave(17);
        radio20Stations.decreaseWave();
        assertEquals(18, radio20Stations.getCurrentWave());
    }

    @Test
    public void nextWave() {
        radioDefault.setCurrentWave(9);
        radioDefault.nextWave();
        assertEquals(0, radioDefault.getCurrentWave());
    }

    @Test
    public void nextWaveRadio20() {
        radio20Stations.setCurrentWave(19);
        radio20Stations.nextWave();
        assertEquals(0, radio20Stations.getCurrentWave());
    }

    @Test
    public void decreaseWave() {
        radioDefault.setCurrentWave(0);
        radioDefault.decreaseWave();
        assertEquals(9, radioDefault.getCurrentWave());
    }

    @Test
    public void decreaseWaveRadio20() {
        radio20Stations.decreaseWave();
        assertEquals(18, radio20Stations.getCurrentWave());
    }

    @Test
    public void waveAboveMax() {
        radioDefault.setCurrentVolume(14);
        radioDefault.nextWave();
        assertEquals(9, radioDefault.getMaxWave());
    }

    @Test
    public void waveAboveMaxRadio20() {
        radio20Stations.setCurrentWave(35);
        radio20Stations.setMaxWave(19);
        radio20Stations.nextWave();
        assertEquals(19, radio20Stations.getMaxWave());
    }

    @Test
    public void waveBelowMin() {
        radioDefault.setCurrentWave(-1);
        radioDefault.nextWave();
        assertEquals(0, radioDefault.getMinWave());
    }

    @Test
    public void waveBelowMinRadio20() {
        radio20Stations.setCurrentWave(-1);
        radio20Stations.nextWave();
        assertEquals(0, radio20Stations.getMinWave());
    }

    @Test
    public void plusVolumeAboveMax() {
        radioDefault.setCurrentVolumeMax(101);
        radioDefault.plusVolume();
        assertEquals(100, radioDefault.getMaxVolume());
    }

    @Test
    public void plusVolumeAboveMaxRadio20() {
        radio20Stations.setCurrentVolumeMax(101);
        radio20Stations.plusVolume();
        assertEquals(100, radio20Stations.getMaxVolume());
    }

    @Test
    public void minusBelowVolumeMin() {
        radioDefault.setCurrentVolumeMin(-1);
        radioDefault.decreaseVolume();
        assertEquals(0, radioDefault.getMinVolume());
    }

    @Test
    public void minusBelowVolumeMinRadio20() {
        radio20Stations.setCurrentVolumeMin(-3);
        radio20Stations.decreaseVolume();
        assertEquals(0, radio20Stations.getMinVolume());
    }

    @Test
    public void plusVolume() {
        radioDefault.setCurrentVolumeMax(98);
        radioDefault.plusVolume();
        assertEquals(99, radioDefault.getCurrentVolume());
    }

    @Test
    public void plusVolumeRadio20() {
        radio20Stations.setCurrentVolumeMax(98);
        radio20Stations.plusVolume();
        assertEquals(99, radio20Stations.getCurrentVolume());
    }

    @Test
    public void minusVolume() {
        radioDefault.setCurrentVolumeMin(98);
        radioDefault.decreaseVolume();
        assertEquals(97, radioDefault.getCurrentVolume());
    }

    @Test
    public void minusVolumeRadio20() {
        radio20Stations.setCurrentVolumeMin(98);
        radio20Stations.decreaseVolume();
        assertEquals(97, radio20Stations.getCurrentVolume());
    }

    @Test
    public void setVolume() {
        radioDefault.setCurrentVolume(7);
        assertEquals(7, radioDefault.getCurrentVolume());
    }

    @Test
    public void setVolumeRadio20() {
        radio20Stations.setCurrentVolume(87);
        assertEquals(87, radio20Stations.getCurrentVolume());
    }
}