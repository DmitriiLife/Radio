package ru.netology;

public class Radio {

    public int minVolume;
    public int maxVolume = 10;
    public int currentVolume;
    public int mimWave;
    public int maxWave = 9;
    public int nextWave;
    public int previousWave;
    public int currentWave;
    public int decreaseVolume;

    public void NextRadio() {
        currentWave = 9;
        nextWave = currentWave + 1;
        if (nextWave > maxWave) {
            nextWave = mimWave;
        }
    }

    public void PreviousRadio() {
        if (previousWave < maxWave) {
            previousWave = maxWave;
        } else {
            previousWave = mimWave;
        }
    }

    public void RadioPlus() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void setCurrentRadio(int currentWave) {
        if (currentWave > maxWave) {
            return;
        }
        if (currentWave < mimWave) {
            return;
        }
        this.currentWave = currentWave;
    }

    public void RadioMinusVolume(int decreaseVolume) {

        if (decreaseVolume > minVolume) {
            return;
        }
        this.decreaseVolume = decreaseVolume;
    }

    public void RadioPlusVolume(int decreaseVolume) {

        if (decreaseVolume > maxVolume) {
            return;
        }
        this.decreaseVolume = decreaseVolume;
    }
}


