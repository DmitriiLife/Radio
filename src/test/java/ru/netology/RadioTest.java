package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void NextRadio() {
        Radio wave = new Radio();
        wave.NextRadio();
        int expected = 0;
        int actual = wave.nextWave;
        assertEquals(expected, actual);
    }

    @Test
    public void PreviousRadio() {
        Radio wave = new Radio();
        wave.PreviousRadio();
        int expected = 9;
        int actual = wave.previousWave;
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadio() {
        Radio wave = new Radio();
        int expected = 0;
        int actual = wave.currentWave;
        assertEquals(expected, actual);
    }

    @Test
    public void RadioPlus() {
        Radio wave = new Radio();
        wave.RadioPlus();
        int expected = 1;
        int actual = wave.currentVolume;
        assertEquals(expected, actual);
    }

    @Test
    public void RadioMinusVolume() {
        Radio wave = new Radio();
        int expected = 0;
        int actual = wave.decreaseVolume;
        assertEquals(expected, actual);
    }

    @Test
    public void RadioPlusVolume() {
        Radio wave = new Radio();
        int expected = 0;
        int actual = wave.decreaseVolume;
        assertEquals(expected, actual);
    }
}