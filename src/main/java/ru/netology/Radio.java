package ru.netology;

public class Radio {

    public int minVolume;
    public int maxVolume = 10;
    public int minWave;
    public int maxWave = 9;
    private int currentWave;
    private int currentVolume;

    public int getCurrentWave() {
        return currentWave;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxWave() {
        return maxWave;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinWave() {
        return minWave;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void nextWave() {
        if (currentWave < maxWave) {
            currentWave++;
        } else {
            currentWave = minWave;
        }
    }

    public void plusVolume() {

        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseWave() {
        if (currentWave > minWave) {
            currentWave--;
        } else {
            currentWave = maxWave;
        }
    }

    public void setCurrentWave(int currentWave) {
        if (currentWave > maxWave) {
            return;
        }
        if (currentWave < minWave) {
            return;
        }
        this.currentWave = currentWave;
    }
}



